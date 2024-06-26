package Week3.Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    // Write a JAVA program to find the maximum between three numbers
    int a,b,c;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    if(a>b&&a>c){
        System.out.print(a);
    }
    else if(b>a && b>c){
        System.out.print(b);
    }
    else{
        System.out.print(c);
    }
    System.out.print(" is largest.");
    scan.close();
    }
}
