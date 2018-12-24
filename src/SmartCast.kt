val string: Any = "strings"
val number: Any = 123

fun checkType(value: Any) = when(value){
        is Int -> value.toString()
        is String -> value.toUpperCase()
        else -> "value is other types!"
    }

fun main(args: Array<String>) {
    println(checkType(string))
    println(checkType(number))
}
