package Week4;

public class jumpStatement {
    public static void main(String[] args) {
        //breall and continue are jump satement
        for(int index=0;index<3;index++){
            if(index==1){
                break; // loop will end
            }
            System.out.println("Index"+index);
        } // break will exit scope here
    
    //can be used in while/do while
    int counter=0;
    while (counter<3) {
        if (counter==1) {
            break;//exit from here
        }
    System.out.println("While counter"+counter);
    counter++;
    }
 /*continue will skip the iteration 
  * or will bypass the statement below it
  */
  for(int index=0;index<5;index++){
    if (index==2) {
        continue; // when called it will bypass everything below
    }
    System.out.println("Continue index "+index);    
}
//labeled break
    outerloop:for(int outer =0;outer<2;outer++){
        for(int inner=0;inner<=5;inner++){
            if(inner==2){
                break outerloop;
            }
            System.out.println("Inner Index"+inner);
        }
        System.out.println("Outer  Index "+ outer);
    }
    }
}
