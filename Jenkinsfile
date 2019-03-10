node{
   stage('SCM Checkout'){
      git credentialsId: 'f7274a9c-af61-4423-8d8c-f65ff30d408c', url: 'https://github.com/kgupta12345/JenkinsPipleineRepository'

   }
   stage('Mvn Package'){
     def mvnHome = tool name: 'maven-3', type: 'maven'
     def mvnCMD = "${mvnHome}/bin/mvn"
     sh "${mvnCMD} clean package"
   }
}