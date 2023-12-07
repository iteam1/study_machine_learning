import scala.annotation.tailrec

def factorial(n:BigInt):BigInt={
    @tailrec
    def fact(n:BigInt, acc:BigInt):BigInt={
        if (n == 0 || n ==1){
            return acc
        }
        else{
            return fact(n-1, n*acc)
        }
    }
    return fact(n,1)
}

println(factorial(100))