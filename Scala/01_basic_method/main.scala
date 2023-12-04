val x = 3
val y = 5

def add(x:Int, y:Int):Int={
    return x + y
}

println(add(x,y))

println(add(6,6))

def subtract(x:Int, y:Int):Int=return x-y

println(subtract(5,2))

def multiply(x:Int, y:Int):Int=return x*y
println(multiply(2,3))

def divide(x:Int, y:Int):Int=return x*y
println(divide(2,3))

def numberStatus(a:Int)=
    if (a < 10) "Less than 10"
    else if (a > 10) "Greater than 10"
    else "It is 10!"

val s = numberStatus(3)
println(s)