// TODO: дополнить определение класса размерами и позицией
class Square(var x:Int, var y:Int, var width:Int ) :Figure(0),Transforming  {

    override fun area(): Float {
       return (this.width*this.width).toFloat()
    }
    override fun resize(zoom: Int) {
        this.width *= zoom
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