object DataObject {
    var config: String = "init"
        get() = "config : ${field}"

    fun setConfigFromNumber(number: Int) {
        config = number.toString()
    }
}

fun main(args: Array<String>) {
    println(DataObject.config)

    DataObject.setConfigFromNumber(123456)
    println(DataObject.config)

    DataObject.config = "modified from setter!"
    println(DataObject.config)
}
