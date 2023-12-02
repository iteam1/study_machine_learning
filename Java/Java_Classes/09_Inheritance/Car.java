class Vehicle{
    protected String brand = "Ford"; // Class attribute, inheritance from sub class
    // Vehicle method
    public void honk(){ 
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang"; // Child sub class attribute
    public static void main(String[] args){
        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the vehicle class) on the myCar object
        myCar.honk();
        
        // Display the value of the brand attribute
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}