pipeline {
	agent any
	tools {												
		maven	'Maven'			
	}
    environment {
        DOCKER_CREDS = credentials('smyndloh-DockerHub')
    }

	stages{
		stage("build jar") {
			steps {
				script {
					echo "Building application"
					sh "mvn package"
				}
			}
		}
		
		stage("build image") {
			steps {
				script {
					echo "Building image"
				    	echo 'Login Completed' 				    	
				}
			
			}
			
		stage("deploy") {
			steps {
				script {
					echo "Deployed application"					  
				}			
			}		
		}


	}			
}
