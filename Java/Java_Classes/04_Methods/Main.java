public class Main{

    static void myMethod(){
        System.out.println("Hello World!");
    }

    // Static method
    static void myStaticMethod(){
        System.out.println("Can be called without create obj");
    }

    // Public method
    public void myPublicMethod(){
        System.out.println("Must be called by create an object");
    }

    // Create a fullThrottle method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    // Create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+maxSpeed);
    }

    public static void main(String[] args){
        myMethod();
        myStaticMethod();
        // myPublicMethod();

        // Create an object
        Main myObj = new Main();
        myObj.myPublicMethod();
        myObj.fullThrottle();
        myObj.speed(200);
    }
}