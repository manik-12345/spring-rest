pipeline{

    agent any
    stages{
        stage('Build'){
            steps{
                withMaven(maven:'maven_3_6_3'){
                    sh 'mvn clean package'
                }
            }
        }
        stage('Deploy'){
            steps{
                withCredentials([[$class:'UsernamePasswordMultiBinding',
                                   credentialsId:'f1385b8e-8cd5-4899-b0b9-4c58c856e0d8',
                                   usernameVariable:'USERNAME'
                                   passwordVariable:'PASSWORD'
                ]]){
                    sh 'cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                    sh 'cf push'
                }
            }
        }
    }

}













