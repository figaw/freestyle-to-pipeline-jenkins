# Hello Pipeline, JobDSL Wrapper

## Purpose

To show that we can configure a Pipeline job
with JobDSL.

## Steps

1. Create a new Freestyle job in Jenkins,
  call it `demo-seed-hello-pipeline-inline`

1. Paste the code from `seed-hello-pipeline-inline.groovy`
  into a JobDSL build step

1. Save and Run the job.

1. Reload the page and notice that a job
  `hello-pipeline-inline` has been created.

1. Run `hello-pipeline-inline` to verify that
  it prints `Hello, World!`

1. Go to the configuration of the job and
  notice that it's a Pipeline job; it has a Pipeline block,
  not a block of build steps.
