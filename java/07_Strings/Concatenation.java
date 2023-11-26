/*
A String in Java is actually an object,
 which contain methods that can perform certain
  operations on strings. For example,
   the length of a string can be found with
    the length() method:
*/
public class Concatenation{
    public static void main(String[] args){

        // string lenght
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length());
        
        // toUpperCase
        String txt2 = "Hello World!";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        // toLowerCase
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));

        // concat by +
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // You can also use the concat() method
        System.out.println(firstName.concat(lastName));
    }
}