pipeline {
	agent any
	tools {												
		maven	'Maven'			
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
					withCredentials ([usernamePassword(credentialsID: 'smyndloh-DockerHub', usernameVariable: 'USER', passwordVariable: 'PWD')]) {
						sh "docker build -t smyndloh/containerz:1.1.0 . "
						sh "echo $PWD | docker login -u $USER --password-stdin"
						sh "docker push smyndloh/containerz:1.1.0"									
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
