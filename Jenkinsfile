pipeline {
    agent any
    parameters {
        choice(name: 'DEPLOY_ENV', choices: ['INT', 'STAGE', 'TEST','PROD'],  description: 'The target environment to deploy artifacts')
    }
    
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                /* `make check` returns non-zero on test failures,
                * using `true` to allow the Pipeline to continue nonetheless
                */
                sh 'make check || true' 
                junit '**/*.xml' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
