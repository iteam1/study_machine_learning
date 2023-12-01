// ass Person is public, should be declared in a file named Person.java
class Person{
    private String name; // private = restricted access

    // Getter syntax must start with get
    public String getName(){
        return name;
    }

    // Setter syntax must start with get
    public void setName(String newName){
        this.name = newName;
    }
}

public class Main{
    public static void main(String[] args){
        Person myObj = new Person();
        // myObj.name = "John";
        // System.out.println(myObj.name); // error
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}