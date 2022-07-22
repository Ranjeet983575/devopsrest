pipeline {
    agent any

    stages {
        stage('Clone_and_Clean') {
            steps {
                //sh "mvn clean"
                //bat "rm -rf devopsrest"
                bat "git clone https://github.com/Ranjeet983575/devopsrest.git"
                bat "mvn clean"
            }
        }
        stage('Unit Test') {
            steps {
                //sh "mvn test"
                bat "mvn test"
            }
        }
        stage('Build') {
            steps {
               //sh "mvn package"
               bat "mvn package"
            }
        }
    }
}