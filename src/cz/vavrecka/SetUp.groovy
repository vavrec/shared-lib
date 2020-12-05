package cz.vavrecka

import groovy.json.JsonSlurper



class SetUp {

    static Object setUp(){
        return new JsonSlurper().parse(new File('resources' + File.separator + 'prod.json'))
    }

    static void main(String[] args) {
        setUp()
    }


}