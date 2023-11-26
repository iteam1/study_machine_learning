public class DeclareManyVars{
    public static void main(String[] args){
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x+y+z);
        
        // You can also simply write
        int a = 5, b = 6, c = 50;
        System.out.println(a+b+c);

        // you can also assign the same value to multiple variables in one line
        int num1, num2, num3;
        num1 = num2 = num3 = 50;
        System.out.println(num1+num2+num3);
    }
}