Kogito
------

**Kogito** is the next generation of business automation platform focused on cloud-native development, deployment and execution.

<p align="center"><img width=55% height=55% src="docs/kogito.png"></p>

[![GitHub Stars](https://img.shields.io/github/stars/kiegroup/kogito-editors-java.svg)](https://github.com/kiegroup/kogito-editors-java/stargazers)
[![GitHub Forks](https://img.shields.io/github/forks/kiegroup/kogito-editors-java.svg)](https://github.com/kiegroup/kogito-editors-java/network/members)
[![GitHub Issues](https://img.shields.io/github/issues/kiegroup/kogito-editors-java.svg)]()
[![Pull Requests](https://img.shields.io/github/issues-pr/kiegroup/kogito-editors-java.svg?style=flat-square)](https://github.com/kiegroup/kogito-editors-java/pulls)
[![Zulip chat](https://img.shields.io/badge/zulip-join_chat-brightgreen.svg)]( https://kie.zulipchat.com)
[![Contributors](https://img.shields.io/github/contributors/kiegroup/kogito-editors-java.svg?style=flat-square)](https://github.com/kiegroup/kogito-editors-java/graphs/contributors)
[![License](https://img.shields.io/github/license/kiegroup/kogito-editors-java.svg)](https://github.com/kiegroup/kogito-editors-java/blob/main/LICENSE)
[![Twitter Follow](https://img.shields.io/twitter/follow/kogito_kie.svg?label=Follow&style=social)](https://twitter.com/kogito_kie?lang=en)

Quick Links
-----------

**Homepage:** http://kogito.kie.org

**Guides and Documentation:** https://kogito.kie.org/guides/

**JIRA Issues:** https://issues.jboss.org/projects/KOGITO


BUILD AND RUN
------------

* set export JAVA_TOOL_OPTIONS="-Xmx8192m -Xms4096m"
* comment in j2cl-maven-plugin at kie-wb-common-stunner/kie-wb-common-stunner-sets/kie-wb-common-stunner-bpmn/kie-wb-common-stunner-bpmn-kogito-runtime/pom.xml
* run 'mvn clean install -Dmaven.test.skip' at the root of the project
* after comment out j2cl-maven-plugin at kie-wb-common-stunner/kie-wb-common-stunner-sets/kie-wb-common-stunner-bpmn/kie-wb-common-stunner-bpmn-kogito-runtime/pom.xml
* in kie-wb-common-stunner/kie-wb-common-stunner-sets/kie-wb-common-stunner-bpmn/kie-wb-common-stunner-bpmn-kogito-runtime folder run 'mvn j2cl:watch'
* once it finished, open one more terminal at kie-wb-common-stunner/kie-wb-common-stunner-sets/kie-wb-common-stunner-bpmn/kie-wb-common-stunner-bpmn-kogito-runtime/target/gwt/launcherDir/kie-wb-common-stunner-bpmn-kogito-runtime

* copy html and css resources from src/main/resources (like here : 'cp -r ../../../../src/main/resources/* .' )
* run your favorite http server (like 'http-server -p 8000')
* open this link in the browser and in the brosere console type "window.deserialize('');"

Requirements
------------

- [Maven](https://maven.apache.org/) 3.6.2 or later
- [Java](https://openjdk.java.net/install/) 11 or later (devel package)

Getting Started
---------------

The [Kogito Examples repository](https://github.com/kiegroup/kogito-examples) module contains a number of examples that you can take a look at and try out yourself. Please take a look at the readme of each individual example for more details on how the example works and how to run it yourself (either locally or on Kubernetes).

Guides
--------------------

The official guides for Kogito can be found at our main website, these include guides for Quarkus and Spring Boot.

- [Kogito Guides](https://kogito.kie.org/guides/).

If you want to read more about Quarkus:

- [Quarkus - Getting Started](https://quarkus.io/get-started/) - Quarkus Getting Started guide
- [Quarkus - Using Kogito to add business automation capabilities to an application](https://quarkus.io/guides/kogito) - A simple quick start hosted on the Quarkus web site.



Building and Contributing to Kogito
-----------------------------------

All contributions are welcome! Before you start please read the [contribution guide](CONTRIBUTING.md).

