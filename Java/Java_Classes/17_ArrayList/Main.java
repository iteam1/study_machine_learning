/*
The ArrayList class is a resizable array,
 which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java,
 is that the size of an array cannot be modified 
 (if you want to add or remove elements to/from an array,
  you have to create a new one). While elements can be added and removed from an ArrayList whenever you want
*/
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // Import the Collections class

public class Main{
    public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>(); // Create a ArrayList object

    // Add items
    cars.add("Volvo");
    cars.add("BWM");
    cars.add("Ford");
    cars.add("Mazda");

    System.out.println(cars);

    // Access an item
    System.out.println(cars.get(0));

    // Change an item
    cars.set(0, "Opel");
    System.out.println(cars.get(0));

    // Remove specific item
    System.out.println(cars.size());
    cars.remove(0);
    System.out.println(cars.size());

    // Remove all the element by clear()
    // cars.clear();
    // System.out.println(cars.size());

    // loop through array
    for(int i =0; i< cars.size();i++){
      System.out.println(cars.get(i));
    }

    for(String i: cars){
      System.out.println(i);
    }

    // Other type
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);

    for (int i: myNumbers){
      System.out.println(i);
    }

  Collections.sort(cars); // Sort cars
  for (String i: cars){
    System.out.println(i);
  }

  ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
  myNumbers2.add(33);
  myNumbers2.add(15);
  myNumbers2.add(20);
  myNumbers2.add(34);
  myNumbers2.add(8);
  myNumbers2.add(12);

  Collections.sort(myNumbers2); // Sort myNumbers2
  for (int i: myNumbers2){
    System.out.println(i);
  }
  }
}
