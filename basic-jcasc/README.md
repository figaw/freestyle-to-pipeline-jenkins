# A Basic JCasC in Docker

For Demo Purposes

## Build

```bash
./build.sh
```

## Run

```bash
./run.sh
```

Congratulations you now have a basic Jenkins configured as code!
    Notice the "Configured as Code!" text on the frontpage.

> NB: To speed up the demos, we've added configuration to the `Dockerfile`,
> to skip the setup wizard of Jenkins.
> An admin user can be configured later under
> `Configure Global Security, Security Realm, Jenkins’ own user database`.

## Versions

Are chosen as the latest LTS version.
See: <https://jenkins.io/changelog-stable/>.

Disclaimer: the Workflow-Aggregator is used for demo purposes,
it's a bundle of plugins for Jenkins Pipeline.
In production please depend on the specific plugins
you actually need, rather than "the latest WA-bundle."

## Notes

I've added basic configuration for the git plugin to jcasc,
since the `seed-hello-world-external` clones from a git repository,
and Jenkins tags the commit locally, and need to have a user
configured in git for this.
