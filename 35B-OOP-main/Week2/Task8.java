package Week2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double length,area, perimeter,volCube;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length");
        length=scan.nextDouble();
        scan.close();
        area = length*length;
        perimeter = 4*(length);

        volCube= length*length*length;
        System.out.println("area = "+area);
        System.out.println("perimeter="+perimeter);
        System.out.println("volume of cube-"+volCube);
        }
    }

