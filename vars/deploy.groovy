import groovy.json.JsonSlurper


def call(String version) {

    node {

        def connectionData = parseSetUp()

        stage("deploy") {
            echo "ola la"
            sshagent(['TEST-SSH']) {
                def connection = connectionData['user'].toString() + '@' + connectionData['address'].toString() + ':' + connectionData['path'].toString()
                //              sh 'pwd'
//                sh "unzip colman-${version}.zip"
//                sh 'scp -r ./colman-$' + version + '/batch ' + connection
//                sh """rm -rf colman-*"""
            }
        }
    }
}

@NonCPS
private Object parseSetUp() {
    return new JsonSlurper().parseText(libraryResource('prod.json'))
}