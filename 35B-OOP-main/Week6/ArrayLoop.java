package Week6;

public class ArrayLoop {
    public static int arrayfind(String[] array, String find) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==(find)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr =new int[4];
        arr[0]= -10;
        arr[1]=0;   
        arr[2]=10;
        arr[3]=20;
        //we need length of array first, uuse .length
        int arrayLength= arr.length;
        //loop from 0 - (arrayLength -1), 0-3
        for(int index=0; index <arrayLength;index++){
            System.out.println(arr[index]);
        }

        // or we can se condition index <=arrayLength-1
        System.out.println("Decending Loop");
        for(int index= arrayLength -1 ;index >=0; index--){
            System.out.println(arr[index]);
        }

        //lopp the  arr using while loop
        //make an array of ["John","Doe","Foo","Bar"]
        //Make a string "Foo"
        //Loop the array and find in which index is "Foo" on
        //print the index
        String[] words={"John","Doe","Foo","Bar"};
        String istiring="Foo";
        for(int i=0; i<words.length;i++){
            if(words[i]==istiring){
                System.out.println(i);
            }
        }

        //make the function for the above name finder 
        //takes array of string and string as parameter
        //return index if 2md argiment value matches any element of array
        //else return -1
        //print the returned index value
        System.out.println(findarr(words,istiring)); 
    }
}
