import groovy.json.JsonSlurper


def call(String version) {

    node {

        def connectionData = parseSetUp()

        stage("deploy") {
            echo "ola la"
            sshagent(['TEST-SSH']) {
                def connection = connectionData['user'] + '@' + connectionData['address'] + ':' + connectionData['path']
                sh 'pwd'
                sh 'ls -la'
                sh "unzip colman-${version}.zip"
                sh 'scp -r ./colman-$' + version + '/batch ' + connection
                sh """rm -rf colman-*"""
            }
        }
    }
}

@NonCPS
private Map<String, String> parseSetUp() {
    def config = new JsonSlurper().parseText(libraryResource('prod.json'))
    return ['user': config['user'], 'address': config['address'], 'path': config['path']]
}