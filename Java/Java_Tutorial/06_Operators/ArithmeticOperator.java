public class ArithmeticOperator{
    public static void main(String[] args){
        int x = 100;
        int y = 6;

        int Addition =  x + y;
        System.out.print("Addition=");
        System.out.println(Addition);
        
        int Subtraction = x - y;
        System.out.print("Subtraction=");
        System.out.println(Subtraction);

        int Multiplication =  x * y;
        System.out.print("Multiplication=");
        System.out.println(Multiplication);

        float  Divison = x / y;
        System.out.print("Divison=");
        System.out.println(Divison);
        
        int Modulus = x % y;
        System.out.print("Modulus=");
        System.out.println(Modulus);
        
        x = x++; // increase value 1
        System.out.print("x=");
        System.out.println(x);

        y = y--; // decrease value 1
        System.out.print("y=");
        System.out.println(y);
    }
}