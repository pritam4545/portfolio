def call(String url, String branch) {
  withCredentials([usernamePassword(credentialsId: 'gitcred', usernameVariable: 'git_user', passwordVariable: 'git_pass')]) {
    git (
      url: ${url}
      branch: ${branch}
      credentialsId: 'gitcred'
    )
  }
}
