package Week3.Tasks;

import java.util.Scanner;

public class SwitchCaseTask4 {
    public static void main(String[] args) {
    int a;
    Scanner scan=new Scanner(System.in);
    System.out.print("Choose the shape: \n 1 . Circle\n2. Rectangle\n3. square\n 4. triangle\n choise : ");
    a=scan.nextInt();
    switch (a) {
        case 1:
            System.out.println("enter the radius of circle");
            double r= scan.nextDouble();
            System.out.println("area= "+(22/7)*r*r);
            break;
        case 2:
            System.out.println("enter the length of rectangle");
            double l= scan.nextDouble();
            System.out.println("enter the breadth of rectangle");
            double b= scan.nextDouble();
            System.out.println("area ="+ l*b);
            break;
        case 3:
            System.out.println("enter the length of square");
            l= scan.nextDouble();
            System.out.println("area = "+ l*l);
            break;
        case 4:
        System.out.println("enter the base of triangle");
        b= scan.nextDouble();
        System.out.println("enter the perpendicular height of triangle");
        l= scan.nextDouble();
            System.out.println("area="+(1/2)*l*b);
            break;
        default:
            System.out.println("ERROR INPUT");
            break;
    }   
    scan.close(); 
    }
}
