package Week7;

public class FirstOOP {
    public static void main(String[] args) {
    Person a= new Person();
    a.name="Joe";
    a.age=10;
    a.gender='M';
    a.introduction();

    Person me= new Person();
    me.name="Sarjak";
    me.age=19;
    me.gender='M';
    me.introduction();

    square sq= new square();
    sq.side=10;
    System.out.println(sq.area());
    sq.addSide(10);
    System.out.println(sq.area());
    }   
}

class square{
    int side;
    int area(){
        int area= side*side;
        return area;
    }
    void addSide(int a){
        side=side+a;
    }
}

class Person{
    //data /fields/attributes/properties
    String name;
    int age;
    char gender;

    // procedures
    void introduction(){
        System.out.println("Hi, My name is "+ name +". My age is "+ age + ". My gender is "+ gender );
    }
}
