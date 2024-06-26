package Week3.Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    // Write a JAVA program to check whether a number is negative, positive, or zero.
    int a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    a=scan.nextInt();
    if(a>0){
        System.out.print("Positive");
    }
    else if(a<0){
        System.out.print("Negetive");
    }
    else{
        System.out.print("Zero");
    }
    scan.close();
    }
}
