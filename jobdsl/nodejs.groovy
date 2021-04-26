job ('nodejs job')
{
scm {
git('https://github.com/olszekr1/nodejs.git')
node / gitConfigName('DSL script')
node / gitConfigEmail('jenkins-dsl-script@altkom.com')
}
}



triggers {
scm('H/5 * * * *')
}



wrappers {
nodejs('nodejs')
}



steps {
shell("node app.js")
}