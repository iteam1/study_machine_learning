public class MultiDim{
    public static void main(String[] args){
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        // get the element
        System.out.println(myNumbers[1][2]);

        // change element values
        myNumbers[1][1] = 8;
        System.out.println(myNumbers[1][1]);

        // loop through
        for (int i=0; i < myNumbers.length; ++i){
            for (int j=0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}