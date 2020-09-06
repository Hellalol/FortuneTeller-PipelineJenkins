pipeline {

     agent any
     stages {
        stage('Build') {

            agent {
                docker { image 'rasilva1986/java-maven:alm' }
            }

            steps {
                echo 'Building..'
                sh 'mvn clean install'
            }

        }

        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }

        }

        stage('Saving artifacts') {

            steps {
                echo 'Saving war file ...'
                }

            post {
                always {
                    echo 'Saving artifacts..'
                    archiveArtifacts artifacts: 'target/*.war', onlyIfSuccessful: true
                }
            }
        }
     }
}