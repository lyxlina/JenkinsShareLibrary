package org.devops

//打印内容,格式化输出
def printMes(value,color){
    //println(content)
    colors = [
        'red' : "\033[31m ${value} \033[0m" ,
        'green' : "\033[32m ${value} \033[0m" ,
        'yellow' : "\033[33m ${value} \033[0m" ]
    ansiColor('xterm') {
    // some block
        println(colors[color])
}
}




