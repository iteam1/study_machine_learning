public class BreakContinue{
    public static void main(String[] args){
        // for
        // break
        for (int i=0; i < 10; i++){
            System.out.print(i);
            if(i==4){
                break;
            }
        }
        System.out.println("");
        // continue
        for(int j=0;j < 10; j++){
            if(j==4){
                continue;
            }
            System.out.print(j);
        }
        // while
        System.out.println("");
        int k = 0;
        while(k < 10){
            System.out.print(k);
            if(k==4){
                break;
            }
            k++;
        }
        System.out.println("");
        int l=0;
        while(l < 10){
            if(l==4){
                l++; // to out of value 4
                continue;
            }
            System.out.print(l);
            l++;
        }
    }
}