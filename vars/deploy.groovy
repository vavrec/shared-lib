import cz.vavrecka.SetUp


def call(String filePath, String version) {

    node {

        def connectionData = SetUp.setUp()

        stage("deploy") {
            sshagent(['TEST-SSH']) {
                def connection = connectionData['user'] +'@'+connectionData['address']+':' + connectionData['path']
                sh "unzip colman-${version}.zip"
                sh 'scp -r ./colman-$' + version + '/batch ' + connection
                sh """rm -rf colman-*"""
            }
        }
    }
}