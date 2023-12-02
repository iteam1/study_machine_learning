// Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);

    // Check if an iem exists
    System.out.println(cars.contains("Mazda"));

    // Check hashset size
    System.out.println(cars.size());

    // remove an item
    cars.remove("Volvo");
    System.out.println(cars);

    // Loop though a HashSet
    for (String i: cars){
        System.out.println(i);
    }

    // remove all item
    cars.clear();
    System.out.println(cars);

    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Show which numbers between 1 and 10 are in the set
    for(int i=1; i <=10; i++){
        if (numbers.contains(i)){
            System.out.println(i + " was found in the set.");
        }
        else{
            System.out.println(i + " was not found in the set.");
        }
    }

  }
}
