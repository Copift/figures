### Демонстрация работы 
val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(1,2,3)
    val f3: Square = Square (1,2,3)

    println(f.area())
    println(f2.area())
    println(f3.area())
    println(f3.toString())
    f3.rotate(RotateDirection.Clockwise,1,2).toString()
    println(f3)




OUTPUT:
28.274334
9.0
1 2 9.0 
-1 2 9.0 