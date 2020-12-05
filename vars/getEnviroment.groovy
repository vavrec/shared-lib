import groovy.json.JsonSlurper

@NonCPS
def call(String version) {
    def config = new JsonSlurper().parseText(libraryResource('prod.json'))
    return ['user': config['user'], 'address': config['address'], 'path': config['path']]
}