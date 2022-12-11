pipeline {
	agent any
	tools {												
		maven	'Maven'						
		
	}
	stages{
		stage("build jar") {
			steps {
				echo "Building application"
			}
		}
		
		stage("build image") {
			steps {
				echo "Building image"
				}
			
			}
			
		stage("deploy") {
			steps {
					echo "Deployed application"
			}		
		}


	}			
}
