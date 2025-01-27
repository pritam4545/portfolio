def call() {
  withCredentials([usernamePassword(credentialsId: 'docker-Cred', passwordVariable: 'docker_pass', usernameVariable: 'docker_user')]) {
    sh "docker login -u ${docker_user} -p ${docker_pass}"
    sh "docker tag portfolio:latest ${docker_user}/portfolio:latest"
    sh "docker push ${docker_user}/portfolio:latest"
    echo "Image Pushed Successfully"
  }
}
