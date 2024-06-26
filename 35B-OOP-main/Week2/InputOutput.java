package Week2;
import java.util.Scanner;

/*
 * or use
 * import java.util.*
 */
public class InputOutput {
    public static void main(String[] args) {
        /*User Output
         * System.out.println("Print next line");
         * "sout" for shortcut
         */
        System.out.println("this string breaks line");
        //System.out.print
        System.out.print("This will not break line.");
        System.out.print(" This will continue");
        /*System.out.printf
         * String formatter
         * %s String, %d Integer, %f Floating point, %b boolean
         * */
        System.out.printf("hello %s,Nice", "World");
        System.out.printf("This is num %d",10);
        // Multiple formatter can be used
        System.out.printf("Num %f and bool %b",10.3f,false);
        /*
         *user input
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("The following takes whole sentence");
        String wholeWString=scan.nextLine();
        System.out.println("The input is"+ wholeWString);
        System.out.println("the following takes integer");
        int intInput = scan.nextInt();
        System.out.println("The input is"+intInput);
        System.out.println("the following takes Double");
        double doubleInput = scan.nextDouble();
        System.out.println("The input is"+doubleInput);
        System.out.println("the following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input is"+booleanInput);
        scan.close(); //close after taking all the inputs
    

    }
}
