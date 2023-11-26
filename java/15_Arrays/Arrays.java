public class Arrays{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        int[] myNum = {10, 20, 30, 40};

        // Change the arraye element
        cars[2] = "Opel";
        System.out.println(cars[2]);

        // Array lenght
        System.out.println(cars.length);
    }
}