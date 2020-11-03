def call() {
    node {
        sh '''
        git version
      '''
    }
}