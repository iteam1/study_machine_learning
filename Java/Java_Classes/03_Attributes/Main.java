public class Main{
    int x = 5;
    // if you don't want to ability to override existing value,
    // declare the attribute as final
    // final int x = 5;

    public static void main(String[] args){
        Main myObj = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj.x);
        
        // Set value of class instance
        myObj.x = 40;
        System.out.println(myObj.x);
        
        // Change the value of x to 25
        myObj.x = 25;
        System.out.println(myObj.x);

        Person myPerson = new Person();
        myPerson.fname = "Joe";
        System.out.println("Name: " + myPerson.fname + " " + myPerson.lname);
        System.out.println("Age: " + myPerson.age);

    }
}