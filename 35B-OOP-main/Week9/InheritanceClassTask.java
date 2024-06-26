package Week9;

public class InheritanceClassTask {
    public static void main(String[] args) {
        Labrador L = new Labrador();
        L.Name="Yudip";
        L.country="Nepal";
        L.color="Gahu goro";
        L.breed="Bahun";
        System.out.printf("Details:\nName:%s\nCountry:%s\ncolor:%s\nbreed:%s\n",L.Name,L.country,L.color,L.breed);
        L.speaks();
        L.fur();
        L.barks();
        L.play();
    }
}
class Animal{
    public String Name;
    void speaks(){
        System.out.println(Name+" is speaking");
    }
}

// reptiles
class Reptile extends Animal{
    protected int eggs;
    void sheds(){
        System.out.println(Name+ " is shedding");
    }
}

class Mammal extends Animal{
    public String breed;
    void fur(){
        System.out.println(Name+" has fur");
    }
}

class Amphibian extends Reptile{
    public String scales;
    void swims(){
        System.out.println(Name + "is swiming");
    }
}

class DogClass extends Mammal{
    public String country;
    void barks(){
        System.out.println(Name+" is barking");
    }
}

class cat extends Mammal{
    public String origin;
    void meows(){
        System.out.println(Name+" is meowing");
    }
}

class Labrador extends DogClass{
    public String color;
    void play(){
        System.out.println(Name + " is Playing");
    }
}