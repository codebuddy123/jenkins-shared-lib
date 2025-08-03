def call()
{
  slackSend(
        channel: 'app-jenkins',
        attachments: [[
            color: 'danger',
            text: "Build Failure: ${env.JOB_NAME} #${env.BUILD_NUMBER}\n" +
                  "Build URL: ${env.BUILD_URL}\n" +
                  "Triggered By: ${env.BUILD_USER}\n" +
                  "Branch: ${env.BRANCH_NAME}"
        ]]
    )
}
