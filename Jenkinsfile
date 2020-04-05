pipeline {
 agent any
   stages{
        stage('Maven Build') {
             steps{
                withMaven(maven : 'maven') {
                   sh 'mvn clean -DskipTests=true install'
                }
             }
        }//stage#1 ends here
        stage('Docker Build'){
                steps{
                    script {
                        sh 'sudo groupadd docker'
                         sh  sudo usermod -aG docker ${USER}
                     su -s ${USER}
                       sh 'docker build -t springbootjenkinspipeline .'
                       //sh 'docker tag  springbootjenkinspipeline rahulvaish/springbootjenkinspipeline'
                    }
                }
        }//stage#2 ends here
        stage('Docker Tag & Push'){
               steps{
                  script{
                      sh "echo '***********  ***********'"
                   }
               }
        }//stage#3 ends here
   }//stages ends here
}//pipeline ends here



