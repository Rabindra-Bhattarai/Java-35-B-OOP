package Week7;

public class AccessModifier {
    public static void main(String[] args) {
        AccessExample waau= new AccessExample();
        waau.name="Ram";
        waau.age=12;
        // waau.salary=1000.21;
        waau.defaultFunction();
        waau.publicFunction();
        waau.privateFunction();
        waau.acessPrivate();     /// using this we can access the private stuffs, process defining a function inside the another class
        waau.setSalary(1002.02);
        System.out.println(waau.getSalary()); // this is using getter to get the data from a private element in another class
        
    }
}

class AccessExample{
    String name; //automatically default, package/folder can access 
    public int age; // can be accessed from anywhere
    private double salary; // can be only accessed inside this class

    void setSalary(double s){ //setter setter is used to give value to privvate function from out classs/ UPDATE THE VALUES
        // always ask paramerter
        salary=s;
    }

    double getSalary(){ // getter is used to access the value of private property  / viewing prrovate property outside the class
        return salary;
    }


    void defaultFunction(){
        System.out.println("I can be accessed inside a package");
    }
    public void publicFunction(){
        System.out.println("I can be acccessed from anywhere ");
    }
    public void privateFunction(){
        System.out.println("I can only be acessed inside the class");
    }
    void acessPrivate(){
        System.out.println(salary);
        privateFunction();
    }
}
