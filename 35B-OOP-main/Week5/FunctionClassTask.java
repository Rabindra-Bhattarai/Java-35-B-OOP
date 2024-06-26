package Week5;

public class FunctionClassTask {

    boolean isEqual(double Num1, double Num2){
        if(Num1 ==Num2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        FunctionClassTask fc= new FunctionClassTask();
        System.out.println(fc.isEqual(90.2,90.2));
        System.out.println(fc.isEqual(90.2,50.2));
    }
}
