# Seed Hello World Inline

## Purpose

To show that we can wrap JobDSL in a JobDSL job.

## Steps

1. Create a new job in Jenkins, call it `demo-seed-external`
1. Copy-paste the code from `seed-hello-world-external.groovy` into a JobDSL build step

1. Save and Run the job.

NB: Notice that a job `seed-external-job` has been created.

1. Go to the `seed-external-job`-job and run this.

1. Notice that a job `hello-world-external` has been created.

1. Run it to verify that it prints `Hello, World External!`

> NB: Notice that the referenced
> `hello_world_external.groovy`-file uses underscores.
>
> _Script names may only contain letters, digits and underscores,
> but may not start with a digit_.
