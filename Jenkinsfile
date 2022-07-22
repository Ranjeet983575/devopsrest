pipeline {
    agent any

    stages {
        stage('Clone and Clean') {
            steps {
                sh "git clone https://github.com/Ranjeet983575/devopsrest"
                sh "mvn clean"

            }
        }
        stage('Unit Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Build') {
            steps {
               sh "mvn package"
            }
        }
    }
}