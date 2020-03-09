def call(String id, String key, String appname, String filepath) {
    sh "curl -sS -o veracode-wrapper.jar https://repo1.maven.org/maven2/com/veracode/vosp/api/wrappers/vosp-api-wrappers-java/19.11.6.0/vosp-api-wrappers-java-19.11.6.0.jar"
    sh "java -jar veracode-wrapper.jar -action uploadandscan -vid ${id} -vkey ${key} -appname ${appname} -createprofile false -version \"commit ${env.GIT_COMMIT[0..6]} build ${env.BUILD_NUMBER}\" -filepath ${filepath} -sandboxname shared-lib-test -createsandbox true"
}
