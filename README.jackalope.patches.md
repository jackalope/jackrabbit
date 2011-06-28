# Jackrabbit patches for Jackalope

For making jackalope work, we need some patches for Jackrabbit. We maintain here a forked version of the 2.2.x branch to not have to wait for jackrabbit to integrate them

The branchname is 2.2-jackalope

# Patches needed for Jackalope to run

## JCR-2454 : spi2dav: JSR 283 NodeType Management

Jira Issue: https://issues.apache.org/jira/browse/JCR-2454 
Commit: https://github.com/jackalope/jackrabbit/commit/28824634087ac49118e5f2a574884467db7d69a4


# Patches not really needed for Jackalope to run (but nice to have for our setups)

## JCR-2968 : Add a JournalRead option for reading (but not writing) the Cluster Journal from a different place than the other journal data

Jira Issue: https://issues.apache.org/jira/browse/JCR-2968
Commit: https://github.com/jackalope/jackrabbit/commit/6e977b43603b8f7eea886a96d62fbd266c4ca8c1

## JCR-3004 : Check if a DAV-Request has a Label in the header, before checking if it's version-controlled

Jira Issue: https://issues.apache.org/jira/browse/JCR-3004
Commit: https://github.com/jackalope/jackrabbit/commit/423199a71b7cdc6b71713b0c232f23de1de2eb10

# Download

The Jackrabbit-standalone jar can be downloaded from https://s3-eu-west-1.amazonaws.com/patched-jackrabbit/jackrabbit-standalone-2.2.8-jackalope-SNAPSHOT.jar (or if that doesn't work, try http://patched-jackrabbit.s3-website-eu-west-1.amazonaws.com/ for further links)

