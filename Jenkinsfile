
pipeline {
    agent any
    parameters {
        choice(name: 'DEPLOY_ENV', choices: ['int', 'stage', 'prod'],  description: 'The target environment to deploy artifacts')
    }
    stages {       
        stage('Building project, running tests and publishing test results') {
            agent { 
                docker{ image 'vincefra/docker:latest'}
            }   
            steps {		
                 sh 'echo "Cleaning tests.."'
                    mvn clean test 
             }
            post {
                always {            
                    junit 'target/surefire-reports/*.xml'
                    publishHTML([
                    allowMissing          : false,
                    alwaysLinkToLastBuild : false,
                    keepAll               : true,
                    reportDir             : 'target/',
                    reportFiles           : 'index.html',
                    reportTitles          : "Tests coverage",
                    reportName            : "Tests coverage"
                    ])
                }
                success {
                    archive "target/calc-jsf-1.0.war"
                }
            } 
        }         
    }
}
