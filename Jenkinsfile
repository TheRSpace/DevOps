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
        //stage('CompileAndRun'){
                //steps{
                        //Don't know if the Run lover is right so added this compile and run
                        //sh 'cd C:/"Program Files (x86)"/Jenkins/workspace/DevOps/src/main/java/com/test/DevOpsTest \n javac MainApp.java'
                        //sh 'jar cfe JarExample.jar MainAPP.class'
                        //sh 'jar uf JarExample.jar'
                        //it didn't wanted to compile so I left it commented
                //}
        //}
        stage('Run'){
                steps{
                        //Don't know if this is the right way to run already compiled class which maven compiled
                        sh 'cd C:/"Program Files (x86)"/Jenkins/workspace/DevOps/target \n java -cp DevOpsTest-0.0.1-SNAPSHOT.jar com.test.DevOpsTest.MainAPP'
                        
                }
        }
    }
}
node('master'){
        stage('SCM Checkout'){
               git 'https://github.com/TheRSpace/DevOps'
         }
}

