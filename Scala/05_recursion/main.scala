// in recursion return type must be declare
def factor(n:BigInt):BigInt= {
    if (n==0 || n == 1){
        return 1
    }
    else {
        return n * factor(n-1)
    }
}

println(factor(5))
println(factor(10000))