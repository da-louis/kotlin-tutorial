package mylib

fun add(num1:Int, num2: Int):Int {
    return num1 + num2
}

infix fun Int.myAdd(num:Int):Int{
    return this + num
}

fun Int.square():Int {
    return this*this
}

fun main(args :Array<String>) {
    println(add(123,456))
    println(123 myAdd 456)
    println(15.square())
}
