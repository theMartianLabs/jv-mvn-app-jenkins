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
					sh "docker build -t smyndloh/containerz:1.1.0 . "
					sh "echo $DOCKER_CREDS_PSW | docker login -u $DOCKER_CREDS_USR --password-stdin"
					echo '***************************     Login Completed     *******************************'
					sh "docker push smyndloh/containerz:1.1.0"
					echo '***************************     Image Pushed to DockerHUb    *******************************'
					
				}
			
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
