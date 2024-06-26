package Week5;

public class FunctionClass {
    /*Function are amde inside a class scope
     * above or below main not inside
     */
    void printSomething(){
        System.out.println("Ravi, Yudip, Sarjak");
    }
    //with return type
    int returnInt(){
        int value=10;
        return value;
    }
    double addValue(int num1,double num2){
        double sum= num2+num1;
        return sum;
    }
    public static void main(String[] args) {
        /*
         *to call a normal . non static function we need to create object,
         * just remember the syntax for now
         */
        FunctionClass fc= new FunctionClass();
        //call function from object/ variable of FunctionClass
        fc.printSomething();
        /*can call multiple times */
        fc.printSomething();
        System.out.println(fc.returnInt());
        double returnFromAdd=fc.addValue(10, 20);
        System.out.println(returnFromAdd);
    }
}