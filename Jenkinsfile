node{
  stage('SCM Checkout'){
    git 'https://github.com/TheRSpace/DevOps'
  }
  stage('Compile-Package'){
    def home = tool name: 'Oracle JDK 8', type: 'jdk'
    sh "${home}/bin/UnitTest"
  }
}
