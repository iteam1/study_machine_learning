/*
Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed
*/

public class IfElse{
    public static void main(String[] args){
        if (20 > 18){
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y){
            System.out.println("x is greater than y");
        }

        int time = 20;
        if (time < 18){
            System.out.println("Good day.");
        }
        else{
            System.out.println("Good evening");
        }

        time = 22;
        if(time < 10){
            System.out.println("Good morning!");
        }
        else if (time < 18){
            System.out.println("Good day.");
        }
        else{
            System.out.println("Good everning!");
        }

        // Short hand var = (cond) ? TrueVal : FalseVal

        String result = (time < 18) ? "Good day!" : "Good everning";
        System.out.println(result);

    }
}