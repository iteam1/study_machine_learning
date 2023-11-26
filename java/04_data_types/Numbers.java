public class Numbers{
    public static void main(String[] args){
        // byte
        byte myByte = 100;
        System.out.print("myByte=");
        System.out.println(myByte);
        
        // short
        short myShort = 5000;
        System.out.print("myShort=");
        System.out.println(myShort);
        
        // int
        int myInt = 100000;
        System.out.print("myInt=");
        System.out.println(myInt);

        // long
        long myLong = 15000000000L;
        System.out.print("myLong=");
        System.out.println(myLong);

        // float
        float myFloat = 5.75f;
        System.out.print("myFloat-");
        System.out.println(myFloat);

        // double
        double myDouble = 19.99d;
        System.out.print("myDouble=");
        System.out.println(myDouble);

        // floating point number can also be a
        // scientific number with an "e" to
        // indicate the power of 10
        float f1 = 35e2f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}