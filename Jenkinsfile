node{

   
   stage('SCM Checkout'){
    // Configured from Jenkins UI  
   }
   
   stage('Build Project') {
    sh 'cd /var/lib/jenkins/workspace/firstmbpipeline_master'
    sh "mvn clean install"
   }
   
   stage('Build Docker Image'){
     sh 'docker build -t rahulvaish/springbootjenkinspipeline:2.0.0 .'
   }
   
    /*stage('Push Docker Image'){
     withCredentials([string(credentialsId: 'MYDOCKERPASSWORD', variable: 'dockerHubPwd')]) {
        sh "docker login -u rahulvaish -p ${dockerHubPwd}"
     }
     sh 'docker push rahulvaish/springbootjenkinspipeline:2.0.0'
   }*/
   
}



