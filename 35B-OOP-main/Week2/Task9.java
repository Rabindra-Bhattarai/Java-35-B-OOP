package Week2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
         * Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
         */
        Scanner scan=new Scanner(System.in);
        double length,breadth,area;
        int result;
        System.out.println("length :");
        length=scan.nextDouble();
        System.out.println("breadth :");
        breadth=scan.nextDouble();
        area=length * breadth;
        result= (int)area;
        scan.close();
        System.out.println("Non type casted area=>"+area);
        System.out.println("Typexasted area=>"+result);
    }   
}
