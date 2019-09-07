
pipeline {
    agent any
    parameters {
        choice(name: 'DEPLOY_ENV', choices: ['int', 'stage', 'prod'],  description: 'The target environment to deploy artifacts')
    }
    stages {       
        stage('Building project, running tests and publishing test results') {
            agent { 
                docker{ image 'rasilva1986/java-maven:alm'}
            }   
            steps {		
                 sh 'echo "Cleaning tests.."'
                 sh 'mvn clean install'
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
                    archive "target/FortuneTellingMaven-1.0-SNAPSHOT.war"
                }
            } 
        }   
        
       stage('Deploying artifacts to selected target'){
            agent any
            steps{
                sh 'export PATH=/opt/glassfish-4.1.1/bin/asadmin:$PATH'
                sh 'asadmin --port 4848 deploy --force --name FortuneTellingMaven-${DEPLOY_ENV} --contextroot FortuneTellingMaven-${DEPLOY_ENV} target/FortuneTellingMaven-1.0-SNAPSHOT.war'
            }
        } 
    }
}
