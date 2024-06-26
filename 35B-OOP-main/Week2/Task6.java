package Week2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
         * Take two integer inputs from the user.
         *  First, calculate the sum of two, then the product of two. 
         * Finally, calculate the division of the thus obtained sum and product and print the result.
         */
        int a,b,sum,product,division;
         Scanner init= new Scanner(System.in);
        System.out.println("enter first number");
        a= init.nextInt();
        System.out.println("enter second number");
        b= init.nextInt();
        sum=a+b;
        product=a*b;
        division=product/sum;
        System.out.println("result="+division);
        init.close();
    }
}
