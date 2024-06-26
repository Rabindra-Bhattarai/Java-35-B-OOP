package Week6;

import java.util.ArrayList;

public class ArrayListClass {
    /* Import array list from java.util at the top
     * cannot use primitive datatypes, use wrapper for it 
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        System.out.println(arrayList1);
        // u can add inex directly
        arrayList1.add(1,-20);
        //this will shoft the currently element in 1 th index to 2nd index
        System.out.println(arrayList1);
        //to remove index .remove(index)
        arrayList1.remove(0);
        System.out.println(arrayList1);
        //to update.set(index,value)
        arrayList1.set(0,-200);
        System.out.println(arrayList1);
        //to access .get(index)
        System.out.println("Oth index element is "+arrayList1.get(0));
    }
}
