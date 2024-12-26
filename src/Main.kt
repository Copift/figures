fun main() {

    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    print(movable)

    movable.move(2,1)
    print(movable)
    // переменной базового класса
    val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(1,2,3)
    val f3: Square = Square (1,2,3)

    println(f.area())
    println(f2.area())
    println(f3.area())
    println(f3.toString())
    f3.rotate(RotateDirection.Clockwise,1,2).toString()
    println(f3)

}