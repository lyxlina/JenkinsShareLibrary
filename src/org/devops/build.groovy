package org.devops


//构建类型
def build(buildType,buildShell){

    def buildTools = ["mvn":"M3","gradle":"GRADLE","npm":"NPM"]
    println("当前的构建类型${buildType}")
    buildHome = tool buildTools[buildType]
    sh "${buildHome}/bin/${buildType} ${buildShell}"
}
