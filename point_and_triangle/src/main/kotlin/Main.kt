fun main() {
    var i=1
    println("Введите координаты ${i++} вершины треугольника:")
    val x1 = pointx()
    val y1 = pointy()
    println("Введите координаты ${i++} вершины треугольника:")
    val x2 = pointx()
    val y2 = pointy()
    println("Введите координаты $i вершины треугольника:")
    val x3 = pointx()
    val y3 = pointy()
    println("Введите координаты отдельной точки:")
    val xp = pointx()
    val yp = pointy()
    Counting().count(x1,y1,x2,y2,x3,y3,xp,yp)
}

fun pointx():Double{
    print("x = ")
    return input()
}
fun pointy():Double{
    print("y = ")
    return input()
}
fun input():Double{
    var buf:String
    do {
        buf = readln()
        if (buf.toDoubleOrNull()==null)
        {
            print("Введите координату в виде числа: ")
        }
    }
    while (buf.toDoubleOrNull()==null)
    return buf.toDouble()
}

class Counting{
    fun count(x1:Double,y1:Double,x2:Double,y2:Double,x3:Double,y3:Double,xp:Double,yp:Double){
        val point1:Double = (x1-xp) * (y2-y1) - (x2 - x1) * (y1 - yp)
        val point2:Double=(x2-xp) * (y3-y2) - (x3 - x2) * (y2 - yp)
        val point3:Double=(x3-xp) * (y1-y3) - (x1 - x3) * (y3 - yp)
        if ((point1>=0.0 && point2>=0.0 && point3>=0.0)||(point1<=0.0 && point2<=0.0 && point3<=0.0))
        {
            println("Точка принадлежит треугольнику")
            return
        }
        else {
            println("Точка не принадлежит треугольнику")
            return
        }
    }
}