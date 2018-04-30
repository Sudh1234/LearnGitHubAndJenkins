pipeline {

	//agent any
	agent none

	stages {
	
				stage('Clean Stage') {
		agent { label 'FirstNode' }
			steps {
				sh 'mvn clean'
				
			}
		}
		
		stage('Testing Stage') {
		agent { label 'NileshFirstNode' }
			steps {
				echo 'Testing stage'
				sh 'mvn test'
			}
		}
		
		stage('Compile stage') {
		agent { label 'ApatleNode'}
			steps {
					echo 'compile stage'
					sh 'mvn compile'
			}
		}
		
		stage('Install stage') {
		agent { label 'FirstNode' }
			steps {
					echo 'install stage'
					sh 'mvn install'
			}
		}

	}
	
}
