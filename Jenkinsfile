pipeline {
   agent none

   stages {
      stage('Build') {
        steps {
          echo 'Building...'
          sh 'mvn -B clean package'
          echo "Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
        }
      }
      stage('Test') {
        steps {
           //sh './gradlew check'
           //sh 'java -version'
           echo 'Testing...'
        }
      }
      stage('Deploy') {
        steps {
          echo 'Deploying...'
        }
      }
  }
   //post {
       // always {
            //junit 'build/reports/**/*.xml'
        //}
    //}
}
node{
  stage('SCM Checkout'){
    git 'https://github.com/TheRSpace/DevOps'
  }
  stage('Maven install'){
     sh 'mvn install'
     
  }
  stage('Run App'){
      
   }
}
