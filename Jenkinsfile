pipeline {

	//agent any
	agent none

	stages {
	
				stage('Compile Stage') {
		agent { label 'FirstNode' }
			steps {
				sh 'mvn clean compile'
				echo 'compile stage'
				sh 'mvn compile'
			}
		}
		
		stage('Testing Stage') {
		agent { label 'NileshFirstNode' }
			steps {
				echo 'Testing stage'
				sh 'mvn test'
			}
		}
		
		stage('Deployment Stage') {
		agent { label 'FirstNode' }
			steps {
					echo 'Deployment is going on'
					sh 'mvn install'
			}
		}
		
		

	}
	
}
