package Week6;

public class MultiDimArray {
    public static void main(String[] args) {
        int[] oneDArray; // one dimentional array
        int[][] twoDArray;//two dimentional array
        int[][][] threeDArray;//three dimentional array
        //memory allocaion,, must give size to each dimention
        twoDArray=new int [2][3];
        twoDArray[0][0]=10;
        twoDArray[0][1]=10;
        twoDArray[1][0]=10;
        twoDArray[1][2]=10;
        //access in variable
        int arrayElement = twoDArray[0][0];
        System.out.println(arrayElement);
        System.out.println(twoDArray[0][1]);

        //task
        /*[
            [10]
        ] 
        Print the value
        50,
        56*/
        int[][] ar=new int[5][2];
        ar[0][0]=10;
        ar[0][1]=-10;
        ar[1][0]=20;
        ar[1][1]=-20;
        ar[2][0]=-30;
        ar[2][1]=8;
        ar[3][0]=40;
        ar[3][1]=45;
        ar[4][0]=50;
        ar[4][1]=56;
        System.out.println(ar[4][0]);
        System.out.println(ar[3][1]);
        // array using nested loop
        int outerLength = twoDArray.length;
        for(int outer =0;outer<outerLength;outer++){
            int innerLength=twoDArray[outer].length;
            for(int inner=0;inner <innerLength;inner++){
                System.out.println(twoDArray[outer][inner]);
            }
        }
    }
}
