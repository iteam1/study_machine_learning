/*
There is no lazy var, only lazy val
lazy val = block of value and will change each reference
*/
lazy val a = {println("evaluated"); 5} // block is a multple statement

lazy val b = 10 + c // c is not already established
lazy val c = 5
println(b)

var divisor = 0
lazy val d = 40 / divisor
println(d)

// lazy forgiving if an exception happensbut not in script
divisor = 4
println(d)