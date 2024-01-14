pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('sonar_token')
        MAVEN_HOME = tool 'maven'
        PATH = "$MAVEN_HOME/bin:$PATH"
    }

    tools {
        maven 'maven'
    }

    stages {
        stage('Code Analysis') {
            steps {
                sh "mvn sonar:sonar"
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean install"
            }
        }
    }

    post {
        success {
            echo 'Build successful!'
            // Add post-build actions for success
        }
        failure {
            echo 'Build failed!'
            // Add post-build actions for failure
        }
    }
}
