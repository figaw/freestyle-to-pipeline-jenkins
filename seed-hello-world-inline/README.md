# Seed Hello World Inline

## Purpose

To show that we can wrap JobDSL in a JobDSL job.

## Steps

1. Create a new job in Jenkins, call it `demo-seed-inline`

1. Copy-paste the code from `seed-hello-world-inline.groovy` into a JobDSL build step

1. Save and Run the job.

    NB: Notice that a job `seed-inline-job` has been created.

1. Go to the `seed-inline-job`-job and run this.

1. Notice that a job `hello-world-seedet` has been created.

1. Run it to verify that it prints `Hello, World!`
