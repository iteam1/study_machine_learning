def decide (b:Boolean, x:Any, y:Any):Any = if (b) x else y

println(decide(true,"A","B"))

println(decide(false,3,10))

println(decide(true,'c','d'))

def getNextChar(c:Char) = (c+1).toChar

val result = decide(true, 'c', 'd')

if (result.isInstanceOf[Char]){
    val charResult = result.asInstanceOf[Char]
    println(getNextChar(charResult))
}

//Parameterized
def decideParam[T](b:Boolean, x:T, y:T):T = if (b) x else y

val res = decideParam(true, 'c', 'd')