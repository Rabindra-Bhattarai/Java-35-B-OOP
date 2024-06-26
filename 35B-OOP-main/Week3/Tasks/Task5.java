package Week3.Tasks;

import java.util.Scanner;

public class Task5 {
    //Write a JAVA program to check whether a year is a leap year or not. 

//Hint: if year%4==0; if year%100!==0 ; year%400==0;
public static void main(String[] args) {
    int a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter year");
    a=scan.nextInt();
    System.out.print(a);
    if(a%400==0 || (a%100==0 && a%4==0)){
        System.out.print(" is leap year");
    }
    else{
        System.out.print(" is not leap year");
    }
    scan.close();
} 
}
