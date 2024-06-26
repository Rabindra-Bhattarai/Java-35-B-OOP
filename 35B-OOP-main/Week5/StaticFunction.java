package Week5;

public class StaticFunction {
    public static int multiply(int a,int b){
        int multiplication =a*b;
        return multiplication;
    }
    public static String vendingMachine(int menu){
        if (menu==1) {
            return "Coke";
        }
        else if (menu == 3) {
            return "water";
        }
        else if (menu==3) {
            return "Furti";            
        }
        else{
            return "Invalid Input";
        }
        }
    public static void main(String[] args) {
        /*if the funtion is static and in same class
         * no need to make object simply call
         */
        int multiplyReturn = multiply(10,2);
        System.out.println("Return is "+multiplyReturn);
        String iGet=vendingMachine(1);
        System.out.println("I get "+iGet);
    }
}
