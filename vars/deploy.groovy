def call() {
  sh "docker run --name portfolio-container -p 5173:5173 -d pritam44/portfolio:latest"
}
