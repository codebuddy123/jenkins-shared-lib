// create a groovy function 
def call()
{
    emailext (
        subject: "❌ FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        to: 'javaforash@gmail.com',
        mimeType: 'text/html',
        body: """
            <html>
                <body style="font-family: Arial, sans-serif;">
                    <h2 style="color:red;">❌ Build Failed!</h2>
                    <p><b>Job:</b> ${env.JOB_NAME}</p>
                    <p><b>Build Number:</b> #${env.BUILD_NUMBER}</p>
                    <p><b>Build URL:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
                    <br/>
                    <table border="1" cellpadding="5" cellspacing="0" style="border-collapse: collapse;">
                        <tr>
                            <th style="background-color:#f44336;color:white;">Status</th>
                            <th style="background-color:#f44336;color:white;">Triggered By</th>
                            <th style="background-color:#f44336;color:white;">Branch</th>
                        </tr>
                        <tr>
                            <td style="text-align:center;">FAILURE</td>
                            <td style="text-align:center;">${env.BUILD_USER}</td>
                            <td style="text-align:center;">${env.BRANCH_NAME}</td>
                        </tr>
                    </table>
                    <br/>
                    <p style="font-size:small;color:gray;">This is an automated message from Jenkins CI/CD Pipeline.</p>
                </body>
            </html>
        """
    )
}