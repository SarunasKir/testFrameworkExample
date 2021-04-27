node('maven3') {

    def serviceName = 'api-test-framework'
    def gitURL = 'https://github/api-test-framework.git'

    stage('Checkout') {
        git url: "${gitURL}", branch: 'master'
    }

    try {
        stage('Build') {
            sh 'mvn -s settings.xml -q compile'
        }
    }

    catch (Exception err) {
        mail to: "name.surname@gmail.se",
                cc: "name.surename@gmail.se",
                subject: """Jenkins job ${env.BUILD_NUMBER}] failed.""",
                mimeType: "text/html",
                body: """Job '${env.JOB_NAME} [${env.BUILD_NUMBER}] - ${env.BUILD_URL} console':</p> \n cause:"""
    }
}