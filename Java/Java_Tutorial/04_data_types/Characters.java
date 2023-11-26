/*Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
*/
public class Characters{
    public static void main(String[] args){
        char myGrade = 'B';
        System.out.print("myGrade=");
        System.out.println(myGrade);

        // convert int to character via ASCII table
        char myVar1=65, myVar2=66, myVar3=67;
        System.out.print("myVar1=");
        System.out.println(myVar1);

        System.out.print("myVar2=");
        System.out.println(myVar2);

        System.out.print("myVar3=");
        System.out.println(myVar3);

        String greeting = "Hello World!";
        System.out.println(greeting);
    }
}