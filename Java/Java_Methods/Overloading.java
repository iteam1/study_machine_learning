public class Overloading{
    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    // function overloading
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args){
        
        int myNum1 = plusMethodInt(5,5);
        double myNum2 = plusMethodDouble(3.3,6.4);
        
        System.out.println("int="+myNum1);
        System.out.println("double="+myNum2);

        System.out.println("int="+plusMethod(2,3));
        System.out.println("double="+plusMethod(2.1,3.4));
    }
}