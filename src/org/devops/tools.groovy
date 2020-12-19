package org.devops

//打印内容
def printMes(content){
    println(content)
    colors = [
        'blue' : "\033[46;30m 天蓝底黑字 \033[0m"，
        'red' : "\033[5;34m 红字在闪烁 \033[0m"，
        'black' : "\033[30m 黑色字 \033[0m"，
        'green' : "\033[32m 绿色字 \033[0m" ]
    ansiColor('xterm') {
    // some block
        println(colors[color])
}
}




