public class ForLoop{
    public static void main(String[] args){
        
        for (int i=0; i < 5; i++){
            System.out.println(i);
        }

        for (int j=0; j<=10; j=j+2){
            System.out.println(j);
        }

        for (int k=0; k<=5; k++){
            System.out.print("k=");
            System.out.println(k);
            for (int l=0; l<=5; l++){
                System.out.print("l=");
                System.out.println(l);
            }
        }
    }
}