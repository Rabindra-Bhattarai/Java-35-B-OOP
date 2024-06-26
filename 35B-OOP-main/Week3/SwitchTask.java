package Week3;
import java.util.Scanner;
public class SwitchTask {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter integer");
        int a=scanner.nextInt();
        scanner.close();
        switch (a) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
