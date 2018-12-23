enum class Direction{
    NORTH,
    SOUTH,
    WEST,
    EAST
}

fun main(args: Array<String>){
    val direction = Direction.EAST

    when(direction){
        Direction.NORTH -> println("north")
        Direction.SOUTH -> println("south")
        Direction.WEST -> println("west")
        Direction.EAST -> println("east")
    }
}
