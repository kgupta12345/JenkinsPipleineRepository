node{

   
   stage('SCM Checkout'){
      git credentialsId: 'd55a4d0d-94d8-4a65-9fd0-386668cf3dd1', url: 'https://github.com/kgupta12345/JenkinsPipleineRepository'
   }
   
   stage('Build Project') {
    cd /var/lib/jenkins/workspace/firstmbpipeline_master
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



