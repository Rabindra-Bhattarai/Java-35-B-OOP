package Week9;

public class InheritanceClassConstructorTask {
    public static void main(String[] args) {
        halfPant a= new halfPant();
    }
}

class Pant{
    String color,texture;
    Pant(String color,String texture){
        this.color=color;
        this.texture=texture;
    }
}

class halfPant extends Pant{
    String color="White";
    halfPant(){
        super("Black","Wool");
    }
    void design(String color){
        super.color=color;
        this.color=color;
    }

}