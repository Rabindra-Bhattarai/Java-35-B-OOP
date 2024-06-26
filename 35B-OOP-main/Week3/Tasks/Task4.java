package Week3.Tasks;

import java.util.Scanner;

public class Task4 {
    //Write a JAVA program to check whether a number is even or odd.
    public static void main(String[] args) {
    int a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    a=scan.nextInt();
    System.out.print(a);
    if(a%2==0){
        System.out.print(" is even");
    }
    else{
        System.out.print(" is odd");
    }
    scan.close();
    }
}
