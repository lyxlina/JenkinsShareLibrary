package org.devops

//打印内容,格式化输出
def printMes(value,color){
    println(content)
    colors = [
        'blue' : "\033[46;30m ${value} \033[0m"，
        'red' : "\033[5;34m ${value} \033[0m"，
        'black' : "\033[30m ${value} \033[0m"，
        'green' : "\033[32m ${value} \033[0m" ]
    ansiColor('xterm') {
    // some block
        println(colors[color])
}
}




