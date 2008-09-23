/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.core.cluster;

import org.apache.jackrabbit.core.state.NodeState;
import org.apache.jackrabbit.core.state.ChangeLog;

/**
 * Describes a journal operation for a node deletion.
 */
public class NodeDeletedOperation extends NodeOperation {

    /**
     * Creates a new instance of this class.
     */
    NodeDeletedOperation() {
        super(ItemOperation.DELETED);
    }

    /**
     * Create a node operation for a deleted node. The only member that must be transmitted is the node id.
     *
     * @param state node state
     * @return node operation
     */
    public static NodeOperation create(NodeState state) {
        NodeOperation operation = new NodeDeletedOperation();
        operation.setId(state.getNodeId());
        return operation;
    }

    /**
     * {@inheritDoc}
     */
    public void apply(ChangeLog changeLog) {
        NodeState state = new NodeState(getId(), null, null, NodeState.STATUS_NEW, false);
        state.setStatus(NodeState.STATUS_EXISTING_REMOVED);
        changeLog.deleted(state);
    }

}