# Hello World, JobDSL Wrapper

## Purpose

To show that we can wrap a pipeline in JobDSL.

## Steps

1. Create a new job in Jenkins, call it `demo-seed-jobdsl-wrapper`

1. Copy-paste the code from slide into JobDSL build step

    ```groovy
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
    ```

1. Save and Run the job.

NB: Notice that a job `hello-pipeline-inline` has been created.

1. Run it to verify that it prints `Hello, World!`
