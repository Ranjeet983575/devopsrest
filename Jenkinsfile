pipeline {
    agent any

    stages {
        stage('Clone and Clean') {
            steps {
                sh "git clone https://github.com/Ranjeet983575/devopsrest"
                sh "mvn clean -f devopsrest"

            }
        }
        stage('Unit Test') {
            steps {
                sh "mvn test -f devopsrest"
            }
        }
        stage('Build') {
            steps {
               sh "mvn package -f devopsrest"
            }
        }
    }
}