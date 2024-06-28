package Week11;


public class Polumorism{
    public static void main(String[] args) {
        MathOperation mo=new MathOperation();
        System.out.println(mo.add(10,20));
        System.out.println(mo.add(10,20,50));
        mo.add();

        // method overriding 
        Document d1=new Document();
        d1.print("Black");
        // Polymorphism allow child object to be stored in
        // parent Class variable
        Document d2= new MsWord();
        d2.print("white");
        //doing so will take the updated f unction and attribute from child
        // object representation
        Document d3= new Office365();
        d3.print("yellow");
        // when the parent variable holds child object 
        // only the attribute nd function written in Parent can be used 
        // eg: d3.online;-cannot be used
        }
}

//method overloading -- completime morphism
// .. making same function mu,tiple times with dff in parameters
class MathOperation{
    int add(int num1,int num2)
{
    return num1+num2;
}
// changind the number of parameter 
int add(int num1,int num2,int num3)
{
    return num1+num2+num3;
}
// changind the datatype of parameter
double add(double num1,double num2)
{
    return num1+num2;
}
// note: method overloading expects the unique in data type of parameter 
// cannot overload method just by changing variable
// EG: int add(int a,int b)-> cannot do this as ad wotj 2 int already made
// cannot overload just by chaging the return datatype
// /EG: double add(int num1,int num2)-> cannot do this as add with 2 int already made
void add(){
    System.out.println("Invalid Operation");
}
}

// Method overriding - rinrime poly morphism
// making the same function of Parent class in ChildcLASS

class Document{
    public void print(String paper){
        System.out.println("Document Printing");
    }
}

//method overrriding is only possible in ChildClass
class MsWord extends Document{
    boolean online = false ;
    @Override
    public void print(String paper){
        System.out.println("Ms word is printing");
    }
}

// method overriding can  be donr in multi lebvel inheritance
class Office365 extends MsWord{
    boolean online= true;
    @Override
    public void print(String paper){
        System.out.println("Online is printing");
    }
} 
