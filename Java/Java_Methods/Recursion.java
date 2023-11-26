public class Recursion{
    public static void main(String[] args){
        int result = sum(10);
        int start = 5;
        int end = 10;
        System.out.println(result);
        System.out.println(5,10);
    }

    public static int sum(int k){
        if (k > 0){
            return k + sum(k-1);
        }
        else{
            return 0;
        }
    }

    // public static int sum2(int start, int end){
    //     if (end > start){
    //         return end + sum(start, end -1);
    //     }
    //     else{
    //         return end;
    //     }
    // }
}