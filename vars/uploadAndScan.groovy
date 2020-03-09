def call(String id, String key, String appname, String filepath) {
    sh "java -jar veracode-wrapper.jar -action uploadandscan -vid ${id} -vkey ${key} -appname ${appname} -createprofile false -version 'test1234' -filepath ${filepath}"
}
