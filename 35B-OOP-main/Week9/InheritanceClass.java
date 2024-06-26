package Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc= new ChildClass();
        cc.firstname="XYZ";
        cc.lastname="ANX";
        cc.expenses=1001.11;
        //cc.salary=10000;
        cc.info();
        cc.detail();        
    }
}
class ParentClass{
    public String lastname;
    private int salary;
    protected double expenses;
    void info(){
        System.out.println("Parent Function "+ lastname);
    }
}

//to use inheritance use the keyword "extends"
// single level inheritance, one parent/super -one child/sub
 
class ChildClass extends ParentClass{
    String firstname;
    void detail(){   
        System.out.println(firstname + " " + lastname );
    }
}
// multilevevl ingeremtance, nested class, child class has another child class
class GrandChildClass extends ChildClass{
    String middle_name;
    void description(){
        System.out.println(firstname+ " " + middle_name + lastname );
    }
}
// trree / heirarical inherentennce
// one parent, multiple children;

class BrotherClass extends ParentClass{
    String address;
    void living(){
        System.out.println(lastname+" "+address);
    }
}

