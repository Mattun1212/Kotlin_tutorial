package com.example.greetingcard

fun main(args: Array<String>) {
    while (true) {
        print("整数を入力してください: ")
        val input = readlnOrNull()
        val n = input?.toIntOrNull()

        if (n == null) {
            println("整数を入力してください")
        } else if (n < 1) {
            println("1以上の整数を入力してください")
        } else {
            pyramid(n)
        }

        print("終了しますか？(y/n): ")
        val exit = readlnOrNull()
        if (exit?.lowercase() == "y") {
            break
        }
    }

}

fun pyramid(n: Int){
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (j in 1..i) {
            print(j % 10)
        }
        for (j in i - 1 downTo 1) {
            print(j % 10)
        }
        println()
    }
}