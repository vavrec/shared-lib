import groovy.json.JsonSlurper


def call(String version) {

    node {

        def connectionData = parseSetUp()

        stage("deploy") {
            echo "ola la"
            sshagent(['TEST-SSH']) {
                def connection = connectionData['user'] +'@'+connectionData['address']+':' + connectionData['path']
                sh "unzip colman-${version}.zip"
                sh 'scp -r ./colman-$' + version + '/batch ' + connection
                sh """rm -rf colman-*"""
            }
        }
    }
}


private  Object parseSetUp(){
    return new JsonSlurper().parseText(libraryResource('prod.json'))
}