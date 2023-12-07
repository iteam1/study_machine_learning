import scala.annotation.tailrec

@tailrec
def fact(n:BigInt, acc:BigInt):BigInt={
    if(n==0 || n==1){
        return acc
    }
    else{
        return fact(n-1, acc * n)
    }
}

def factorial(n:Int) = fact(n,1)

println(factorial(10000))