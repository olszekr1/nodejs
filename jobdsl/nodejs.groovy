job ('nodejs job')
{
    scm{
git('https://github.com/olszekr1/nodejs.git')
    node / gitConfigName('DSL script')
    node / gitConfigEmail
        triggers{
            scm('H/5 * * * *')
            wrpappers{
            nodejs('dodejs')
            steps{
            shell('node app.js')
            }
            }
        }
    }
}