abstract class Person{
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Abstract)
class Student extends Person{
    public int graduationYear = 2018;
    // the body of the abstract method is provided here
    public void study(){
        System.out.println("Studying all day long");
    }
}

// Code from filename
class Abstract{
    public static void main(String[] args){
        // create an object of the student class
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: "+ myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}