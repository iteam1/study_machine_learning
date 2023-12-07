def `Summation of`(x:Int, y:Int)=  x+y

println(`Summation of`(4,19))

def areWeLikingScala_? = true

val status = if(areWeLikingScala_?) "Nice" else "Ugh?"
println(status)

def `return` (x:Double, y:Double) = (x+y+4.0).toString

val g = `return`(40.0, 10)
println(g)