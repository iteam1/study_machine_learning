// A constructor is a special method that is used to initialize objects
public class Main{
    int x; // create class attribute
    
    // create a class constructor for the main class
    // constructor must match the class name and can not have return type
    // All class have the constructor as the default
    public Main(){
        x = 5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args){
        Main myObj = new Main(); // Create an object of class Main
        System.out.println(myObj.x);
    }
}