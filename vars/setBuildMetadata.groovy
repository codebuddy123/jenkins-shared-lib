def call()
{
                // Get Git Branch Name
                 env.BRANCH_NAME = sh(script: 'git rev-parse --abbrev-ref HEAD', returnStdout: true).trim()

                // Get Build Triggered User (Requires Build User Vars Plugin)
                wrap([$class: 'BuildUser']) {
                env.BUILD_USER = env.BUILD_USER ?: 'Automated'

                "echo metadata is set successfully"
            }
}
