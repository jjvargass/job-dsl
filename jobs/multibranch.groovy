multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote('git@github.com:jjvargass/test-jenkins-01.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}