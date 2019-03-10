node{
   stage('SCM Checkout'){
      git credentialsId: 'f7274a9c-af61-4423-8d8c-f65ff30d408c', url: 'https://github.com/kgupta12345/JenkinsPipleineRepository'

   }
   stage ('Compile Stage') {
       steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
            }
     }

     stage ('Testing Stage') {

         steps {
             withMaven(maven : 'maven_3_5_0') {
                 sh 'mvn test'
             }
         }
     }


     stage ('Deployment Stage') {
         steps {
             withMaven(maven : 'maven_3_5_0') {
                 sh 'mvn deploy'
             }
         }
     }
}
