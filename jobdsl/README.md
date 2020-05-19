# Manual Freestyle Job to JobDSL (instantly)

## Purpose

To show that we can (almost) instantly convert a job from
a manual freestyle job to naïve JobDSL.

## Prerequisites

A job in Jenkins.

## Steps

Get a copy of `xml_to_jobdsl_template.groovy` from:
<https://github.com/figaw/configuration-as-code-jenkins-k8s/tree/master/jobdsl>

Follow the steps:

1. Replace the `XML JOB HERE`-part with the contents of your `config.xml` file.
    > Go to the `/config.xml` endpoint of a job in your browser,
    > and use "view-source" to get the raw XML.
2. Remove the XML header `<?xml version='1.1' encoding='UTF-8'?>`
    > NB: keep the `<project>`-tag
3. Give the job a name other than `replace-me-jobdsl`.
    > NB: don't use whitespaces.

Congratulations! You've now converted your job to JobDSL.
