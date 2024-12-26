// сочетание определения класса и конструктора одновременно объявляет переменные и задаёт их значения
class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Transforming, Movable, Figure(0) {

    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    // нужно явно указывать, что вы переопределяете метод
    override fun move(dx: Int, dy: Int) {
        this.x += dx; this.y += dy
    }

    // для каждого класса area() определяется по-своему
    override fun area(): Float {
        return (this.width*this.height).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun resize(zoom: Int) {
        this.width *= zoom
        this.height *= zoom

    }
    override fun toString(): String {
        return "${x} ${y} ${this.area()} "
    }
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when(direction){
            RotateDirection.Clockwise->{
                this.x=this.x*-1
                this.y=this.y*1
            }
            RotateDirection.Clockwise->{
            this.x=this.x*1
            this.y=this.y*-1
        }
        }

    }
}