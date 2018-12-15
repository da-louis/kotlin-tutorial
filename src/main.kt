import kotlin.math.*

val users = mapOf(
        1 to "Jane",
        2 to "John",
        3 to "Mike"
)

val text = """
string
template
test
"""

fun nullableString() : String? {
        return null
}

fun main (args:Array<String>) {
    println(PI)

    for((id,name) in users){
       println("ID:$id, Name:$name")
    }

    println(text)

    println(nullableString()?:"text was null")

    users.map{(key, value) -> println("ID:$key, Name:$value")}
}
