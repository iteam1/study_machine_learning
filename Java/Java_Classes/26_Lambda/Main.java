/*
xpressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as if or for. In order to do more complex operations, a code block can be used with curly braces.
 If the lambda expression needs to return a value,
 then the code block should have a return statement.

parameter -> expression
*/
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {System.out.println(n);});
    }
}