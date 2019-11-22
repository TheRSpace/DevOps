pipeline{
        agent none
       tools {
        maven 'MavenLoco'
       }
}
node{
        stage('SCM Checkout'){
               git 'https://github.com/TheRSpace/DevOps'
         }
        stage('Maven install'){
                sh 'mvn install'
        }
        stage('Run'){
                sh 'cd $HOME/workspace/DevOps/target \n java -cp DevOps-1.0.jar MainApp.Main'
        }
        stage('Compile-Package'){
           sh 'mvn package'
        }
}
