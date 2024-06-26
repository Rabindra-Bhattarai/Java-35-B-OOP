package Week10;

public class InterfaceClass {
    public static void main(String[] args) {
        //
    }
}

// interface is made as same as class replacing with "interface"
// Interface canot be mmade object of

interface AnimalDo{
    public void move();
    public boolean eat(String food);
    //functions of interface is automatically public and abstract 
}

interface MammalDo extends AnimalDo{
    public int legs();
}
interface DogDo extends MammalDo{
    public void bark();
}

class Huskey implements DogDo{
    @Override
    public void bark(){
        System.out.println("Pyak Pyak");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void move(){
        System.out.println("huskey move fast");
    }
    @Override 
    public boolean eat(String food){
            System.out.println("Huskeu eat fish");
            return false;
    }
    
}

//"implements" keyword to use interface 
class Wolf implements AnimalDo{
    @Override 
    public void move(){
        System.out.println("Wolf move fast");
    }
    @Override
    public boolean eat(String food){
        System.out.println("wolf eat meat");
        return false;
    }
}

class cow implements AnimalDo{
    @Override
    public void move(){
        System.out.println("Cow is slow");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Cow eat sabji");
        return false;
    }
}
interface DomesticAnimalDo{
    public void pet();
}

class Husky implements DogDo,DomesticAnimalDo{
    @Override
    public void bark(){
        System.out.println("Pyak Pyak");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void move(){
        System.out.println("huskey move fast");
    }
    @Override 
    public boolean eat(String food){
            System.out.println("Huskeu eat fish");
            return false;
    }
    
    @Override
    public void pet() {
        System.out.println("Huskey likes pet");
    }
}