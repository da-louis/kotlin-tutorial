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

val intArr : Array<Int> = arrayOf(1,2,5,8,10)
val strArr : Array<String> = arrayOf("John","Apple","Watch","")

data class User (val name:String, val age:Int)


fun main (args:Array<String>) {
    println(PI)

    for((id,name) in users){
       println("ID:$id, Name:$name")
    }

    println(text)

    println(nullableString()?:"text was null")

    users.map{(key, value) -> println("ID:$key, Name:$value")}

    println(intArr.max())
    println(strArr.maxBy{it.length})

    val userData = User("Smith", 24)

    println("${userData.name} is ${userData.age}")
}
