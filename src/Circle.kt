// TODO: дополнить определение класса размерами и позицией
import kotlin.math.PI
import java.math.*
class Circle(val x:Int, val y:Int, var r:Int) :Transforming, Figure(0) {

    override fun area(): Float {
        return  (PI*r*r).toFloat()
    }

    override fun resize(zoom: Int) {
        this.r=this.r*zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "${x} ${y} ${this.area()} "
    }
}