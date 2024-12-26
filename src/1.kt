fun main(){
    val spacing = arrayOf(1.2, 1.5, 2.0)
    val lines = arrayOf(3, 4, 5)
    var length = 0.0
    for(sp in spacing)
        for (line in lines)
            length += sp * line
    print(length)


}