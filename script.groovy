def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'smyndloh-DockerHub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t smyndloh/containerz:1.3.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push smyndloh/containerz:1.3.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this