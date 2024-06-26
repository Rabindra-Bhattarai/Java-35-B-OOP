package Week2;

public class Task2 {
    public static void main(String[] args) {
        /* Write a program to find sinple interest from variables
         * make 3 variables for amount, time, and rate and save the calculation to si
         * Formula: si = amount * time * rate/100; // use float double
         */
        double amount, time, rate, si;
        amount=1500.20d;
        time=2.5d;
        rate=12.2d;
        si = amount * time * rate/100;
        System.out.println(si);
    }
    
}
