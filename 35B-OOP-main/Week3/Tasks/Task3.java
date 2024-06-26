package Week3.Tasks;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    //Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
    int a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    a=scan.nextInt();
    System.out.print(a);
    if(a%5==0 && a%11==0){
        System.out.print(" is Divisible by 5 and 11");
    }
    else{
        System.out.print(" is not divisible by 5 and 11");
    }
    scan.close();

  }  
}
