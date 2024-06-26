package Week3;

public class IfElseClass{
    public static void main(String[] args) {
        if(true){
            System.out.println("True Statement");
        }
        //If takes boolean expressiom inside ()
        int num1=10, num2=20;
        if(num1==num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");  //note: else statement is optional
        }
        //the else statement must be aadded at last
        //if else if ladder
        if(num1>num2){
            System.out.println("Greater");
        }
        else if(num1!=num2){
            System.out.println("smaller");
        }
        else if(num1==num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        //nested if 
        if(num1<0){
            if(num1>num2){
                System.out.println("Negetive and greater");
            }
            else{
                System.out.println("Negetive and lesser");
            }
        }
        else{
            if(num1>num2){
                System.out.println("positive and greater");
            }
            else{
                System.out.println("positive and lesser");
            }            
        }
    }
}