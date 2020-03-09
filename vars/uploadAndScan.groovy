def call(String id, String key, String appname, String filepath) {
    sh 'java -jar veracode-wrapper.jar -action uploadandscan -vid ${id} -vkey ${key} -appname ${appname} -createprofile false -version "commit ${env.GIT_COMMIT[0..6]} build ${env.BUILD_NUMBER}" -filepath ${filepath} -sandboxname shared-lib-test -createsandbox true'
}
