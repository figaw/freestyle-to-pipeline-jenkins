# Iterative Conversion Demo

This conversion is also shown in the slideshow,
with more explicitly highlighted steps.

## Purpose

The JobDSL-demo shows us that we can instantly wrap
the `config.xml` of any job in a JobDSL wrapper,
i.e. convert it to _naïve JobDSL_.

The purpose of this demo is to show that we can iteratively
unfold the XML wrapped in a naïve JobDSL job,
and convert it to native JobDSL.

## Steps

Diff the files `iterationX.groovy` and
notice how the JobDSL and wrapped XML changes.

- `iteration0`: a basic hello-world `config.xml` wrapped in JobDSL
- `iteration1-2`: converting the `description` tag
- `iteration3-7`: converting the `builders`-tag to `steps, shell`

> The conversion of the builders tag could be done in a single go.
> The purpose however, is to show that we can drill down to the `hudson.tasks.Shell`-tag,
> or even the `command`-tag in the XML.
> This is practical if our job has several `shell`-build steps,
> That we'd like to convert one at a time.
