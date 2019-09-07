pipeline {
    agent any
    parameters {
        choice(name: 'DEPLOY_ENV', choices: ['INT', 'STAGE', 'TEST','PROD'],  description: 'The target environment to deploy artifacts')
    }
    
    stages {
        stage('Building project, running tests and publishing test results') {
            steps {
                echo 'Building..'
            }
        }
    }
}
