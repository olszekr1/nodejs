job ('dodawanie')
{
scm {
git('https://github.com/olszekr1/nodejs.git'){node ->
node / gitConfigName('DSL script')
node / gitConfigEmail('jenkins@wp.pl')
}
}



triggers {
scm('H/5 * * * *')
}



wrappers {
nodejs('nodejs')
}



steps {
shell("app2.js")
}
}