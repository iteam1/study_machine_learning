public class Loop{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        for (String k : cars){
            System.out.println(k);
        }
    }
}