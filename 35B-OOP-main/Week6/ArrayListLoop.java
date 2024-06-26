package Week6;

import java.util.ArrayList;

public class ArrayListLoop {
    // import ArrayList on top, import java.util.ArrayList
    public static void main(String[] args) {
       ArrayList<Integer> intArr=new ArrayList<>();  
       intArr.add(10);
       intArr.add(20);
       intArr.add(30);
       intArr.add(50);
       // to loop the ArrayList, same as array, get length/size first
       // to get the length use size()
       int arrLen=intArr.size();
       // loop from 0 to size/len-2
       for(int index=0; index<arrLen;index++){
        System.out.println("Index"+index+"Values"+intArr.get(index));
       }
       // using for each
       for(Integer element:intArr){
            System.out.println(element);
       }
    }
   

}
