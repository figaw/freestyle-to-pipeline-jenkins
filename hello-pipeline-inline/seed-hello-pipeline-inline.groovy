pipelineJob('hello-pipeline-inline') {
  definition { cps { script("""
    pipeline {
      agent any
      stages {
        stage('Hello, World!') {
          steps {
            sh 'echo "Hello, World!"'
          }
        }
      }
    }
  """) } }
}
