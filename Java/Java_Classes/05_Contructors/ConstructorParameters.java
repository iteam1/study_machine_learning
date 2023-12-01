/*
Constructor with parameter
*/
public class ConstructorParameters{
    int age;
    String name;

    public ConstructorParameters(int x, String y){
        age = x; // parameters and attribute can not have the same name
        name = y;
    }
    
    public static void main(String[] args){
        ConstructorParameters myObj = new ConstructorParameters(4,"Jim");
        System.out.println(myObj.name + " " +myObj.age);
    }
}