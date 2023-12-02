/*
The try statement allows you to define a block of code
 to be tested for errors while it is being executed.

The catch statement allows you to define a block
 of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}

The throw statement is used together with an exception type.
 There are many exception types available in Java:
  ArithmeticException,
   FileNotFoundException,
    ArrayIndexOutOfBoundsException,
     SecurityException, etc:
*/
public class Main{

    static void checkAge(int Age){
        if (Age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else{
            System.out.println("Access granted- you are old enough!");
        }
    }
    public static void main(String[] args){
        
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }

        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e){
            System.out.println("Something other went wrong!");
        }
        finally{
            System.out.println("The 'try-catch' is finished");
        }

        checkAge(15);

    }
}