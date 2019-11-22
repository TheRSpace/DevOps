
node{
        stage('SCM Checkout'){
               git 'https://github.com/TheRSpace/DevOps'
         }
        stage('Maven install'){
         sh 'mvn install'
        }
        stage('Compile-Package'){
           sh 'mvn package'
        }
}
