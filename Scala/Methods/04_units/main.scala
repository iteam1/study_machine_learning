val a = ()
println(a)

val b:Unit =()
println(b)

val c = println("Scala Rocks")
println(c)

def add(x:Int, y:Int)={
    x+y
}

def badAdd(x:Int, y:Int){
    x + y
}

def addUnit(x:Int, y:Int):Unit = x + y

println(badAdd(4,5))

println(addUnit(5,6))