
node{
        stage('SCM Checkout'){
               git 'https://github.com/TheRSpace/DevOps'
         }
        stage('Compile-Package'){
           sh 'mvn package'
        }
}
