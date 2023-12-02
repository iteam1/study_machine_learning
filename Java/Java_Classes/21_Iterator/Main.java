// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        // Make collection
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        System.out.println(it.next());

        // Loop through a collection
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Other type
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        myNums.add(1);
        myNums.add(20);
        myNums.add(3);
        myNums.add(14);

        Iterator<Integer> myIt = myNums.iterator();

        // Loop through a collection
        while(myIt.hasNext()){
            Integer i = myIt.next();
            if(i < 10){
                myIt.remove();
                }
            }
        System.out.println(myNums);
    }
}
