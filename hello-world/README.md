# Hello World in JobDSL

## Purpose

To show that we can configure a job as code.

## Steps

1. Create a new job in Jenkins, call it `demo-seed-hello`

1. Copy-paste the code from slide into JobDSL build step

    ```groovy
    job('hello-world') {
      steps {
        shell('echo Hello, World!')
      }
    }

    ```

1. Save and Run the job.

NB: Notice that a job `seed-inline-job` has been created.

1. Go to the `seed-inline-job`-job and run this.

1. Notice that a job `hello-world-seedet` has been created.

1. Run it to verify that it prints `Hello, World!`
