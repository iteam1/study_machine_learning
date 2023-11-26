public class Parameters{
    static void Method1(String fname){
        System.out.println(fname + " Refsnes");
    }

    static void Method2(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    // If you want the method to return a value, you can use a primitive data type
    static int Method3(int x){
        return x + 3;
    }

    // multi parameters
    static int Method4(int x, int y){
        return x + y;
    }

    // If else in method
    static void Method5(int age){
        // if age less than 18 print "access denied"
        if (age < 18){
            System.out.println("Acess denied - You are not old enough");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args){

        // Single parameter
        Method1("Liam");
        Method1("Jenny");
        Method1("Anja");

        // Multi parameters
        Method2("Liam",53);
        Method2("Jenny",21);
        Method2("Anja",7);

        // Return values
        System.out.println(Method3(4));
        System.out.println(Method3(6));
        System.out.println(Method3(1));

        // multi parameters
        System.out.println(Method4(4,6));
        System.out.println(Method4(7,7));
        System.out.println(Method4(1,3));

        // If else in method
        Method5(18);
        Method5(17);


    }
}