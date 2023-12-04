var a = 100
var result = ""

do{
    result = result + a
    if (a > 1) result = result + ","
    a = a -1
}
while(a > 0)
println(result)