package Week3.Tasks;

import java.util.Scanner;

public class SwitchCaseTask1 {
    public static void main(String[] args) {
     /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
    char a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Grade");
    a=scan.next().charAt(0);
    switch (a) {
        case 'A':
            System.out.println("3.2");
            break;
        case 'B':
            System.out.println("2.6");
            break;
        case 'C':
            System.out.println("2");
            break;
        case 'D':
            System.out.println("1.5");
            break;
        case 'F':
            System.out.println("FAIL");
            break;
        default:
            System.out.println("ERROR INPUT");
            break;
    }
    
    scan.close();        
    }
}
