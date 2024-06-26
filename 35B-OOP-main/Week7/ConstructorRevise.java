package Week7;

public class ConstructorRevise {
    public static void main(String[] args) {
        NonParameterizedConstructor a= new NonParameterizedConstructor();
        System.out.println(a.data2);
        ParameterizedConstructor pc= new ParameterizedConstructor(10, "Ram2");
        System.out.println(pc.data2);
        pc.data2="Changing";
        pc.setData1(100);
        System.out.println(pc.getData1());
    }
}
class ParameterizedConstructor{
    private int data1;
    String data2;
    ParameterizedConstructor(int data1,String data2){
        this.data1 = data1;
        this.data2 = data2;
    }
    void setData1(int data1){
        this.data1=data1;
    }
    int getData1(){
        return data1;
    }
}

class NonParameterizedConstructor{
    private int data1;
    String data2;
    NonParameterizedConstructor(){
        data1=10;
        data2="Ram";
        System.out.println("Running in object creation");
    }
    void setData1(int data1){
        this.data1=data1;
    }
}