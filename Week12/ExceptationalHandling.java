package Week12;

public class ExceptationalHandling {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int num1 =10;
        try{
            int num2 = 10/0; //Arithemetic exceptation = exist here

        }catch(ArithmeticException ex){
            System.out.println("Cannot divide by zero");
            }finally{
                System.out.println("finally runs whether exceptation occours or not");
        
        }
        //note: catch and finlayy are optional, but, either or both should be present after try
        int[] numA = new int[5];
        numA[0]=100;
        try{
        numA[100]=1000; //ArrayIndexOutOfBoundsExceptation - exist here
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array is not long enough");
        }  
        //any object can be assigned value of null
        String data = null;
        try{
            System.out.println(data.length()); //NullPointerException - exist here
        }catch(NullPointerException ex){
            System.out.println("data is null");
        }   
        //multi layered exceptation
        try{
            int num3 = 1000/0; //arithemetic exceptation
            String d2 = null; //null pointer exceptation
            System.out.println(d2.length());

        }catch(ArithmeticException ex){
            System.out.println("number Error");
        }catch(NullPointerException ex){
            System.out.println("Null ayo");
        }finally{
            System.out.println("Try end");
        }
        //Exceptation
        try{
            int num3 = 10/0;
            int[] numArr2 = new int[100];
            numArr2[10000] = 10;
        }catch(Exception ex){
            System.out.println("I catch all exceptation");
        }
        //note: if you dont know what kind of exceptation your code throws
        //use exceptation
        //throw manually throw exceptation
        throwExample();
        System.out.println("Program End");
    }
    static void throwExample(){
        throw new ArithmeticException("Where is the number?");
    }
    static void checktry() throws  Exception{
        System.out.println("When runnin gthis function wrap around try catch");
    }
}
