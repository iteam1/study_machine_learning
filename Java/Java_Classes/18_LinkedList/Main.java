// Import the LinkedList class
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BWM");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        System.out.println(cars.getFirst());

        System.out.println(cars.getLast());

        cars.addFirst("Tesla");
        System.out.println(cars);

        cars.addLast("Toyota");
        System.out.println(cars);

        cars.removeFirst();
        System.out.println(cars);

        cars.removeLast();
        System.out.println(cars);
    }
}