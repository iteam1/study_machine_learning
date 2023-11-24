/*In Java, there are different types of variables, for example:

    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false

    type variableName = value;
 */

public class Variables{
    public static void main(String[] args){
        String name = "John"; // String variable
        System.out.print("String name=");
        System.out.println(name);

        char myLetter='D';
        System.out.print("Character myLetter=");
        System.out.println(myLetter);

        int myNum = 15;
        System.out.print("int myNum=");
        System.out.println(myNum);

        // You can also declare a variable without assigning the value
        // But you not give variable a value ,you can not working with this variable
        int Num1;
        // System.out.print("int Num1=");
        // System.out.println(Num1);
        Num1 = 3;
        System.out.print("Num1=");
        System.out.println(Num1);

        float Num2 = 5.0f;
        System.out.print("float Num2=");
        System.out.println(Num2);

        double Num3 = 5.0;
        System.out.print("float Num3=");
        System.out.println(Num3);

        boolean answer=true;
        System.out.print("boolean answer=");
        System.out.println(answer);

        // if you don't want to overwrite existing values,
        // use final keyword to declare your variable is a constant
        final int constNum = 50;
        System.out.print("int constNum=");
        System.out.println(constNum);
        // constNum=30; // will generate an error: cannot assign a value to a final variable
    }
}
