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
				script (
					echo "Building image"					
                    			sh "docker build -t smyndloh/containerz:1.1.0 . "
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
