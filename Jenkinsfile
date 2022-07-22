pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
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