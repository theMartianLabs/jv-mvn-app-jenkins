def gv

pipeline {
	agent any
	tools {												
		maven	'Maven'						
		
	}
    stage("init") {
			steps {
				script {
					gv = load "script.groovy"				  
				}			
			}		
		}
	stages{
		stage("build jar") {
			steps {
				script {
					gv.buildJar()
				}
			}
		}
		
		stage("build image") {
			steps {
				script {
					gv.buildImage()
				}			
			}
        }
			
		stage("deploy") {
			steps {
				script {
					gv.deployApp()			  
				}			
			}		
		}


	}			
}