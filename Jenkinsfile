pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('sonar_token')
    }


    stages {
        stage('Code Analysis') {
            steps {
                // Set up SonarQube Scanner
                tool name: 'maven', type: 'maven'
                withSonarQubeEnv('Sonar Scan') {
                    // Run SonarQube analysis
                    sh "mvn sonar:sonar"
                }
            }
        }

        // stage('Quality Gate Check') {
        //     steps {
        //         script {
        //             def qualityGateStatus = waitForQualityGate()

        //             if (qualityGateStatus != 'OK') {
        //                 error "Quality Gate did not pass. Build will be aborted!"
        //             }
        //         }
        //     }
        // }

        stage('Build') {
            steps {
                // Set up Maven
                tool name: 'maven', type: 'maven'

                // Run Maven build
                sh "mvn clean install"
            }
        }

        // Add more stages as needed, such as testing, deployment, etc.
    }

    post {
        success {
            // Actions to be performed when the build is successful
            echo 'Build successful!'

            // You can add more actions here, such as sending notifications, deploying artifacts, etc.
        }
        failure {
            // Actions to be performed when the build fails
            echo 'Build failed!'

            // You can add more actions here, such as sending notifications, logging, etc.
        }
    }
}
