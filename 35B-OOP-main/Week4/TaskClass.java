package Week4;

import java.util.Scanner;

public class TaskClass {
    /*
     * Task
     * Prompt a user to enter a number
     * run the loop and ask the integer until the 
     * integer is negetive
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter a negetive number");
            a=scan.nextInt();
        }while(a>0);
        System.out.println("Good u entered a negetive number!!!");
        scan.close();
    }
}
