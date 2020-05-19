job('seed-inline-job') {
  steps {
    scm {
        git('https://github.com/figaw/freestyle-to-pipeline-jenkins.git')
    }
    dsl {
      external('seed-hello-world-external/hello-world-external.groovy')
    }
  }
}
