pipeline{
        agent any
       tools {
        jdk 'jdk13'
        maven 'MavenLoco'
       }
         stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
node('master'){
        stage('SCM Checkout'){
               git 'https://github.com/TheRSpace/DevOps'
         }
        //stage('Maven install'){
               // sh 'mvn install'
        //}
        //stage('Run'){
               // sh 'cd $HOME/workspace/DevOps/target \n java -cp DevOps-1.0.jar MainApp.Main'
       // }
        //stage('Compile-Package'){
          // sh 'mvn package'
       // }
}

