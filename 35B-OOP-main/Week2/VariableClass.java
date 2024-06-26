package Week2;

public class VariableClass {
    public static void main(String[] args) {
        /*primitive datatype
         * Declaration
         */
        byte byteValue;
        /*initialization */
        byteValue=10;
        /*declaration and initialization */
        short shortValue=100;
        /*multiple declaration */
        int intValue1, intValue2;
        intValue1=-99;intValue2=99;
        /*Multiple declaration and initialization */
        long longValue1=-999,longValue2=999;
        float floatValue=1.90f; // the letter 'f' is required
        double doubleValue=28.88d;// the letter 'd' is optional
        char charValue=28; // single letter in single quote
        boolean boolValue=false; // true/false lowercase
        
    /*Non primitive data type */
    //string
    String stringInfo1="This is a variable";
    /*using class */
    String stringInfo2= new String("Class");
    /*Object ise the same class as written above */
    VariableClass variableObj=new VariableClass();
    
    }
}
