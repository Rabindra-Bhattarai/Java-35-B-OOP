package Week3.Tasks;

import java.util.Scanner;

public class SwitchCaseTask2 {
    public static void main(String[] args) {
//Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
         char a;
    int b,c;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number ");
    b=scan.nextInt();
    System.out.println("Enter number ");
    c=scan.nextInt();
    System.out.println("Enter operator");
    a=scan.next().charAt(0);
    switch (a) {
        case '+':
            System.out.println(c+b);
            break;
        case '-':
            System.out.println(b-c);
            break;
        case '*':
            System.out.println(b*c);
            break;
        case '/':
            System.out.println(b/c);
            break;
        default:
            System.out.println("ERROR INPUT");
            break;
    }
    
    scan.close();       
    }
}
