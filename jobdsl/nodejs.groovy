job ('job example for npm')
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
shell("npm test,test,1,2,3,")
}
}