package org.devops

//打印内容,格式化输出
def printMes(color){
    //println(content)
    colors = [
        'blue' : "\033[30m 黑色字 \033[0m"，
        'red' : "\033[31m 红色字 \033[0m"，
        'yellow' : ""\033[33m 黄色字 \033[0m" ]
    ansiColor('xterm') {
    // some block
        println(colors[color])
}
}




