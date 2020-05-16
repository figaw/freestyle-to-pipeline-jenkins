def jobsteps = """
  <builders>
    <hudson.tasks.Shell>
      <command>echo &quot;hello world&quot;</command>
    </hudson.tasks.Shell>
  </builders>
"""

def jobconfig = """
<project>
  <keepDependencies>false</keepDependencies>
  <properties/>
  <scm class="hudson.scm.NullSCM"/>
  <canRoam>true</canRoam>
  <disabled>false</disabled>
  <blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding>
  <blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding>
  <triggers>
    <hudson.triggers.TimerTrigger>
      <spec>H 2 * * * </spec>
    </hudson.triggers.TimerTrigger>
  </triggers>
  <concurrentBuild>false</concurrentBuild>
  <publishers/>
  <buildWrappers/>
</project>
"""

def jobconfignode = new XmlParser().parseText(jobconfig)
def jobstepsnode = new XmlParser().parseText(jobsteps)

job('iteration3') {
    description("This is my Job")

    configure { node ->
      node << jobstepsnode
    }

    configure { node ->
        // node represents <project>
        jobconfignode.each { child ->

          def name = child.name()

          def existingChild = node.get(name)
          if(existingChild){
            node.remove(existingChild)
          }

          node << child
        }
    }
}
