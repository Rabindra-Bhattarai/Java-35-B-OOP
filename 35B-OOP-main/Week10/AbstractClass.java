package Week10;

public class AbstractClass {
    public static void main(String[] args) {
        Samsung s=new Samsung();
        Apple a= new Apple();
        s.call("9841231");
        s.sms();
        a.sms();
        a.call("Vyaguto");

    }
}
// to make abstract class keyword "abstract" before "class"
// if you make abstract class, cannot make object of it
abstract class SmartPhone{
    // abstract class may or may not contain abstract functions
    // to make abstract function use "abstract" before ,making finction
    // abstract class dont have a body 
    abstract void sms();
    abstract public boolean call(String number);
    // abstract class can have normal functions
    void imei(){
        System.out.println("Imei Number");
    }  
}

// abstract class can oonly be used in sub/ child class
class Samsung extends SmartPhone{
    //when extending abstract calss we have to implement/override
    //all the abstract function of abstracr class 
    @Override 
    void sms(){
        System.out.println("Samsung way if sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("Samsung calin to "+ number);
        return true;
    }
}
// make a class apple extending Smartphone
// make object samsung and apple 
/// call sms( ) and call() function

class Apple extends SmartPhone{
    //when extending abstract calss we have to implement/override
    //all the abstract function of abstracr class 
    @Override 
    void sms(){
        System.out.println("apple way if sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("apple calin to "+ number);
        return true;
    }
}