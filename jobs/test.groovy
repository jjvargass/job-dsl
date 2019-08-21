project_name = "jenkins-python-pipelinejob-02"
repo = "git@github.com:jjvargass/test-jenkins-01.git"
repo_name = "repo"


folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}


pipelineJob(project_name){
  definition {
      triggers {
          scm('H/1 * * * *')
      }

      cpsScm {
          scm {
              git {
                  remote {
                      name(repo_name)
                      url(repo)
                  }
                }
              scriptPath("Jenkinsfile")
          }
      }

  }
}
