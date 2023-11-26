public class PrintVariables{
    public static void main(String[] args){
        String name="John";
        // combine both text and a variable use +
        System.out.println("Hello "+ "John");

        // you can also use + character to add a variable to another variable
        String firstName="John";
        String lastName="Doe";
        String fullname = firstName + lastName;
        System.out.println("fullname="+fullname);

        int x = 5;
        int y = 6;
        System.out.println(x+y); // Print the value
    }
}