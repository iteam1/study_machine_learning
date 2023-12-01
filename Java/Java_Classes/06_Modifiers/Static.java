public class Static{
    // Static method
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating objects");
    }
    // Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

// Main method
public static void main(String[] args){
    myStaticMethod();

    // Create object
    Static myObj = new Static();
    myObj.myPublicMethod();
    }
}