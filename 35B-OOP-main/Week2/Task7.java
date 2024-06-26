package Week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
    /*
    Take the name, roll number, and field of interest from the user and 
    print in the format below:
     Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. 
     */
    String name,interest;
    int rollno;    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your name");
    name=scan.nextLine();
    System.out.println("Enter roll number name");
    rollno=scan.nextInt();
    System.out.println("Enter your field of interest");
    interest=scan.nextLine();
    scan.close();
    System.out.printf("Hey, my name is %s and my roll number is %d. My field of interest are %s",name,rollno,interest);
    }
}
