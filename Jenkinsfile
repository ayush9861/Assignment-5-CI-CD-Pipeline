pipeline {
    agent any
    tools{
        maven 'maven'
    }
       stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ayush9861/Assignment-5-CI-CD-Pipeline/']]])
                bat 'mvn clean install'
            }
            
        }
         stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t ayush9861/spring-boot-docker-image14 .'
                }
       }
         }
                 stage('Push image to Hub'){
            steps{
                script{
                 withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerpwd')]) {
                     
                       bat 'docker login -u ayush9861 -p Password'

}
                   bat 'docker push ayush9861/spring-boot-docker-image14'
}
}
       }
}
}