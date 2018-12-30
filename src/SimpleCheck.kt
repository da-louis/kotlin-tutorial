fun isSmallLetter(c: Char) = c in 'a'..'z'
fun isBigLetter(c: Char) = c in 'A'..'Z'
fun isLetter(c: Char) = isSmallLetter(c) || isBigLetter(c)

fun main(args: Array<String>) {
    println(isSmallLetter('a'))
    println(isSmallLetter('B'))
    println(isBigLetter('c'))
    println(isBigLetter('D'))
    println(isLetter('e'))
    println(isLetter('0'))
}
