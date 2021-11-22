pipeline {
    agent any
    tools{
        maven 'maven3'
        jdk 'jdk15'
    }
    stages {
            stage ('Build') {
                steps {

                        echo 'Running build phase...'
                }
            }
            stage ('Test') {
                steps {
                        bat 'mvn test'
                        echo 'Running test phase...'
                }
            }

    }
}