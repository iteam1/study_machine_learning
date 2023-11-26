public class JavaMath{
    public static void main(String[] args){
        
        // max
        int x = 5;
        int y = 3;

        System.out.println(Math.max(x,y));

        // min
        System.out.println(Math.min(x,y));

        // sqrt
        System.out.println(Math.sqrt(4));

        // abs
        System.out.println(Math.abs(-4));

        // random
        int randomNum = (int)(Math.random() *101); // 0 to 100
        System.out.println(randomNum);
    }
}