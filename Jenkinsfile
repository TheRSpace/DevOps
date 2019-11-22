
node{
        tools {
                maven 'Maven 3.2.5'
        }
        stage('SCM Checkout'){
               git 'https://github.com/TheRSpace/DevOps'
         }
        stage('Compile-Package'){
           sh 'mvn package'
        }
}
