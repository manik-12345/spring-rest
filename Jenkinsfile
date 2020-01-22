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
                                   credentialsId:'CF_CREDIATIALS',
                                   usernameVariable:'USERNAME',
                                   passwordVariable:'PASSWORD'
                ]]){
                    sh 'cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                    sh 'cf push'
                }
            }
        }
    }

}













