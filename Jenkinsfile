echo 'hello from Pipeline'

node {
  git url: 'https://github.com/Sudh1234/LearnGitHubAndJenkins.git'
 def mvnHome = tool 'M3'
  

  sh "${mvnHome}/bin/mvn -B -Dmaven.test.failure.ignore verify"
  step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
  step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
}
  
