/*
The Scanner class is used to get user input and it found in the java.util package
*/
import java.util.Scanner; // Import the Scanner class

class Main{
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in); // Create a Scanner object
        
        System.out.println("Enter username");
        String userName = myInput.nextLine(); // Read user input
        System.out.println("User name: " + userName);

        System.out.println("Enter age");
        int age = myInput.nextInt();
        System.out.println("Age: " + age);

        System.out.println("Enter salary");
        double salary = myInput.nextDouble();
        System.out.println("Salary: " + salary);

    }
}