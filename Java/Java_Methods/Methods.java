/*A method must be declared within a class.
 It is defined with the name of the method,
  followed by parentheses ().
   Java provides some pre-defined methods,
    such as System.out.println(),
     but you can also create your own methods to perform certain actions*/

public class Methods{
    // define function
    static void myMethod(){
        System.out.println("I just got executed!");
    }

    public static void main(String[] args){
        myMethod();
        myMethod();
        myMethod();
    }
}