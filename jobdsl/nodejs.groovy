job ('job example for npm')
{
scm {
git('https://github.com/olszekr1/nodejs.git'){node ->
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
shell('nodejs/app.js')
}
}