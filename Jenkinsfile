node{
   stage('SCM Checkout'){
      git credentialsId: 'f7274a9c-af61-4423-8d8c-f65ff30d408c', url: 'https://github.com/kgupta12345/JenkinsPipleineRepository'
   }
   
   stage('Build'){
        sh "mvn clean install"
   }
   
   stage('Sonar'){
        try {
            sh "mvn sonar:sonar"
        } catch(error){
            echo "The sonar server could not be reached ${error}"
        }
   }
   
   
    stage('Build Docker Image'){
     sh 'docker build -t rahulvaish/SpringBootJenkinsPipeline:2.0.0 .'
   }
   
    stage('Push Docker Image'){
     withCredentials([string(credentialsId: 'MYDOCKERPASSWORD', variable: 'dockerHubPwd')]) {
        sh "docker login -u rahulvaish -p ${dockerHubPwd}"
     }
     sh 'docker push rahulvaish/SpringBootJenkinsPipeline:2.0.0'
   }
   
}



