@Library('my-shared-library@demo') _

buildMaven(
    node: "slave01-ubuntu",
    gitUrl:"https://github.com/jenkins-docs/simple-java-maven-app.git",
    branch: "main",
    deliverScriptPath: "./jenkins/scripts/deliver.sh" )
