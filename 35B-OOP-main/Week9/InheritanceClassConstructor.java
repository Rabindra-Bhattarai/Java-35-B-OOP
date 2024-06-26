package Week9;

public class InheritanceClassConstructor {
    public static void main(String[] args) {
           Polo p1=new Polo();
    p1.differentColor("Yellow"); 
    Polo p2=new Polo("Red");
    Polo p3=new Polo(10);
    //calling constructor with overloded param
    }
    
}

class shirt{
    String color="Black"; 
    shirt(){
        System.out.println("Making shirt");
    }
    shirt(String color){
        this.color=color;
    }
}

class Polo extends shirt{
    String color = "White";
    String texture;
    Polo(String color){
        //by default the constructor of parent is called
        // meaning super() or Shirt() on first line of execution
        super("White");
        this.color=color;
        System.out.println("constructor with 1 strings");
    }
    Polo(String color,String texture){
        this.color=color;
        this.texture=texture;
        System.out.println("constructor with 2 strings");
    }
    Polo(int num){
        System.out.println(num);
        System.out.println("Constructor with one int");
    }
    Polo(){
        //by default the the constructor of parents is called
        //meaning super() or Shirt() on first line of execution 
        System.out.println("Making Polo Shirt");
    }
    void differentColor(String color){
        System.out.println("Param color "+color);
        System.out.println("Class color"+this.color);
        System.out.println("Parent color"+super.color);
    }
}
