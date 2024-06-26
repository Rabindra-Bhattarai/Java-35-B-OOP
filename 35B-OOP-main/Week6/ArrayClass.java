package Week6;

public class ArrayClass {
    public static void main(String[] args) {
        //array declaration
        int[] myFirstArray;
        //memory allocation
        myFirstArray = new int[3];
        //array declaratom and memory alloc*
        int[] mySecondArray = new int[3];
        //array declaration and memory allocation and initialozatoin
        int[] myThirdArray={10,20,30,40};

        //Array index ->position of element and values
        //starts with 0
        mySecondArray[0]=10;
        mySecondArray[1]=20;
        mySecondArray[2]=100;

        //access/store in new variable
        int arrayElement=mySecondArray[0];
        System.out.println("First index"+arrayElement);
        System.out.println("Second index" + mySecondArray[1]);
        /* Task 1
         * Make the following array name animals
         * ["cat","Dog","Tiger","Snake"]
         * Print "snake"
         */
        String[] animals={"cat","Dog","Tiger","Snake"};
        System.out.println(animals[3]);

    }
}
