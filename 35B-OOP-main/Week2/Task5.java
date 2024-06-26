package Week2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       /* . Write a program to take two integer inputs from the user
        and print the sum and product of
         them.*/
    Scanner scanner= new Scanner(System.in);
    int a,b;
    System.out.println("Enter 1st number");
    a= scanner.nextInt();
    System.out.println("Enter 2nd number");
    b= scanner.nextInt();
    scanner.close();
    System.out.printf("%d * %d = %d\n",a,b,a*b);
    System.out.printf("%d + %d = %d",a,b,a+b);
    }
}
