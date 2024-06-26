package Week3.Tasks;

import java.util.Scanner;

public class SwitchCaseTask3 {
    public static void main(String[] args) {
    int a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter month");
    a=scan.nextInt();
    switch (a) {
        case 1,2,3:
            System.out.println("Winter");
            break;
        case 4,5,6:
            System.out.println("Spring");
            break;
        case 7,8,9:
            System.out.println("Summer");
            break;
        case 10,11,12:
            System.out.println("Fall");
            break;
        default:
            System.out.println("ERROR INPUT");
            break;
    }   
    scan.close();
    }
}
