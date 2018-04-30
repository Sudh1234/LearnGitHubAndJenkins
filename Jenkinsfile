pipeline {

	//agent any
	agent none

	stages {
	
				stage('Compile Stage') {
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
		
		stage('compile stage') {
		agent { label 'ApatleNode'}
			steps {
					echo 'compile stage'
					sh 'mvn compile'
			}
		}
		
		stage('install stage') {
		agent { label 'FirstNode' }
			steps {
					echo 'install stage'
					sh 'mvn install'
			}
		}

	}
	
}
