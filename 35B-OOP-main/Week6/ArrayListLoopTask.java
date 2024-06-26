package Week6;

import java.util.ArrayList;

public class ArrayListLoopTask {
    public static void main(String[] args) {
        /*MAKE AN ArrayList as student as following 
         * ["Aruna","Shreeya","Yudip","Anjali","Nischay","Krishna"]
         * make 2 another ArrayList males and females 
         * loop the students ArrayList
         * add "Yudip","Nischay" and "Krishna" in males
         * add "Aruna","Shreeya" and "Anjali" in females
         * Print Anjali from females
         * Print Yudip form males
        */
        ArrayList<String> students= new ArrayList<>();
        ArrayList<String> females= new ArrayList<>();
        ArrayList<String> males= new ArrayList<>();
        students.add("Aruna");
        students.add("Shreeya");
        students.add("Yudip");
        students.add("Anjali");
        students.add("Nischay");
        students.add("Krishna");
        for(String names: students){
            if(names=="Aruna" || names=="Shreeya"||names=="Anjali"){
                females.add(names);
 
           }
           else{
            males.add(names);
           }
        }
        System.out.println(males.get(0));
        System.out.println(females.get(2));

    }
}
