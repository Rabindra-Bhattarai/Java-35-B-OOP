package Week2;

import java.util.Scanner;

public class Task10 {
public static void main(String[] args) {
//     Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

// a. If equal to or more than 70 -> First Class

// b. If more than 59 -> Upper Second Class

// c. If more than 49 -> Second class

// d. If more than 39 -> Third class and if below than 40 the result is fail. 

// Hint: Use ternary operator
    Double maath,oop,prog,business,totl,perc;
    Scanner scan= new Scanner(System.in);
    String re;
    System.out.println("Enter the marks of math");
    maath=scan.nextDouble();
    System.out.println("Enter the marks of OOP");
    oop=scan.nextDouble();
    System.out.println("Enter the marks of Programming");
    prog=scan.nextDouble();
    System.out.println("Enter the marks of Business");
    business=scan.nextDouble();
    scan.close();
    totl=maath+oop+business+prog;
    perc=(totl/400)*100;
    System.out.println("Total marks= "+totl);
    System.out.println("Percentage secured = "+perc);
    re=perc > 70 ? "First Class" : perc>59 ? "Upper second class" : perc>49 ? "Second Class" : perc > 39 ? "Third Class" : "Fail";
    System.out.println("Result "+re);
}
}
