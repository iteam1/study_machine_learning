def add(x:Int, y:Int)={
    if (x > 10) (x+y).toString
    else x+y
}

object Main
println(add(4,10))