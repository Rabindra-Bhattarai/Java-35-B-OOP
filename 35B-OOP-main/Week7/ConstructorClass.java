package Week7;

public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println("Hehehe");
        ParamConstructor pc= new ParamConstructor(10,20);
        System.out.println(pc.data2);
    }
}

class ParamConstructor{
    private int data1;
    public int data2;
    void SetData1(int data1){
        this.data1=data1;
    }
    ParamConstructor(int d1,int d2){
        data1 = d1;
        data2 = d2;
    }
}

class ConstructorExample{
    //non parameterized constructor
    ConstructorExample(){
        System.out.println("I run in object creation");
        //add more logic
        //Only called 
    }
}