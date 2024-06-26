package Week2;

import java.util.Scanner;
public class TaskInputOutput {

    /*task
     * Make a new scanner object/ variable scan1
     * prompt the following 
     * What is your name? -> save as string, name
     * Are you over 18? -> save as boolean, status
     * how many siblings? - > save as int, sibling
     *Print the following
     Hello,name
     over 18? status
     you have sibling num of sibling
     */
    public static void main(String[] args) {
        Scanner scan1= new Scanner(System.in);
        System.out.println("What is your name");
        String name= scan1.nextLine();
        System.out.println("are you over 18?");
        boolean status= scan1.nextBoolean();
        System.out.println("how many siblings?");
        int sibling = scan1.nextInt();
        System.out.printf("Hello, %s \nover 18? %b\nyou have %d num of sibling",name,status,sibling);
        scan1.close();
    }
}
