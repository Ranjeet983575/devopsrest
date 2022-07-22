pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                //sh "mvn clean"
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