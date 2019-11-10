node{
  stage('SCM Checkout'){
    git 'https://github.com/TheRSpace/DevOps'
  }
  stage('Compile-Package'){
    def home = tool name: '', type: 'jdk'
    sh "${home}/bin/UnitTest"
  }
}
