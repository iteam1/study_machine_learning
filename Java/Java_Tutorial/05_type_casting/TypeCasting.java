/*
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte 
*/

public class TypeCasting{
    public static void main(String[] args){
        
        // widening casting
        int myInt =9;
        double myDouble = myInt; // Atomatic casting int -> double
        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
    
        //narrowing casting
        float myFloat = 5.3f;
        myInt = (int) myFloat; // Manual casting double    
        System.out.println(myFloat);
        System.out.println(myInt);    
    }
}