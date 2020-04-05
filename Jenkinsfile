pipeline {
 agent any
   stages{
        stage('Build') {
             steps{
                withMaven(maven : 'maven') {
                   sh 'mvn clean -DskipTests=true install'
                }
             }
        }//stage#1 ends here
        stage('Docker build'){
                steps{
                   script{
                       sh 'docker build -t rahulvaish/springbootjenkinspipeline:2.0.0 .'
                    }
                }
        }//stage#2 ends here
   }//stages ends here
}//pipeline ends here



