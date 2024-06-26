package Week4;

public class doWhile {
    public static void main(String[] args) {
        //Check the same condition in while and do while for difference
        int counter = 0;
        while (counter < 0) {
            System.out.println("The condition is false, it wont run");
        }
        do{
            System.out.println("this checks the condition first");
        }while(counter<0);
    }
    
}
