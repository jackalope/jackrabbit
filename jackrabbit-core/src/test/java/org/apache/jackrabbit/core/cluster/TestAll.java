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

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Collects all test classes setting up test data in the workspace. This test
 * data is specific to Jackrabbit and will probably not work in other
 * implementations.
 */
public class TestAll extends TestCase {

    /**
     * Returns a <code>Test</code> suite that executes all tests inside this
     * package.
     *
     * @return a <code>Test</code> suite that executes all tests inside this
     *         package.
     */
    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTestSuite(ClusterRecordTest.class);
        suite.addTestSuite(ClusterSyncTest.class);
        suite.addTestSuite(DbClusterTest.class);
        suite.addTestSuite(DbClusterTestJCR3162.class);

        return suite;
    }
}
