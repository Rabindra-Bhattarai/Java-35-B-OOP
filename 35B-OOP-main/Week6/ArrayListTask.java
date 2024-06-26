package Week6;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        /*Task 
         * make array list of the following
         * ["Apple","Orange","Banana","Water Melon","Pineapple"]
         * Add "Grapes" in 1 index
         * Remove Orange from the arrayList
         * Remove water melon
         * add pear in 9th index
         * change "Pineapple to avocado"
         * change "apple" to "Cherry"
         * note print on every add and remove to get the new indes od Arrat list
         * 
         */

         ArrayList<String> fruits = new ArrayList<>();
         fruits.add("Apple");
         fruits.add("Orange");
         fruits.add("Banana");
         fruits.add("Water Melon");
         fruits.add("Pineapple");
         System.out.println(fruits);
         fruits.add(1,"Grapes");
         System.out.println(fruits);
         fruits.remove(2);
         
         System.out.println(fruits);
         fruits.remove(3);
         System.out.println(fruits);
         fruits.add(0,"Pear");
         System.out.println(fruits);
         fruits.set(4, "Avocado");
         System.out.println(fruits);
         fruits.set(1,"Cherry");
         System.out.println(fruits);

    }
}
