FROM jenkins/jenkins:2.222.3
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY jenkins.yaml /var/jenkins_home/casc_configs/
ENV CASC_JENKINS_CONFIG=/var/jenkins_home/casc_configs/jenkins.yaml

# skip setup wizard, see: https://github.com/jenkinsci/docker/issues/310#issuecomment-620899440
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"
