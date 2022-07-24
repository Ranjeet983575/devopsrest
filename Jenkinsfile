pipeline {
    agent any

    stages {
        stage('Clone_and_Clean') {
            steps {
                //sh "mvn clean"
                //bat "rm -rf devopsrest"
                //bat "git clone https://github.com/Ranjeet983575/devopsrest.git"
                checkout([$class: 'GitSCM', branches: [[name: '*/develop']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/Ranjeet983575/devopsrest.git']]])
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
        stage('Docker Image') {
             steps {
                //sh "mvn package"
                bat "docker build -t ranjeet983575/devopsrestapi ."
             }
         }
         stage('Push Docker Image') {
                      steps {
                         withCredentials([string(credentialsId: 'ranjeet983575', variable: 'DockerHub')]) {
                                     bat "docker login -u ranjeet983575 -p ${DockerHub}"
                                     bat "docker push ranjeet983575/devopsrestapi"
                              }
                      }
                  }

    }
}