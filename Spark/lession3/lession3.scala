object Lession3{
    def main(args: Array[String]){
        println("Practice Operators!")
        val x:Int = 3
        val y:Int = 6
        
        val res:Int = add(x,y)
        println("Summary of 2 number"+res)

        // closure
        val multiplier = (i:Int) => i * 10
        println(multiplier(5))

    }

    // function
    def add(a:Int, b:Int): Int={
        val c = a+b
        return c
    }
}