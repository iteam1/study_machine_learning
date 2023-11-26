public class JavaBooleans{
    public static void main(String[] args){
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int x = 10;
        int y = 9;
        System.out.println(x > y);

        System.out.println(10 > 9);

        System.out.println(x == 10);

        System.out.println(10 == 15);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        myAge = 25;
        votingAge = 18;

        if (myAge >= votingAge){
            System.out.println("Old enough to vote!");
        }
        else{
            System.out.println("Not old enough to vote.");
        }
    }
}