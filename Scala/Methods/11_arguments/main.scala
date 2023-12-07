def procesNumbers(b:Boolean, x:Int, y:Int) = if (b) x else y

println(procesNumbers(true, 10, 41))

// name argument

println(procesNumbers(x= 10, y=41, b= true))

// default argument

def add(x:Int, y:Int=10) = x+y

println(add(10))

println(add(4,4))