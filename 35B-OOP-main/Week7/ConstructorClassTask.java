package Week7;

public class ConstructorClassTask {
    public static void main(String[] args) {
        Cat ravi= new Cat("Ravi",10);
        ravi.setAge(ravi.getage()+1);
        ravi.breed="Xy";
        ravi.color="Orange";
        System.out.printf("Name: %s\nAge: %d\nBreed: %s\nColor: %s",ravi.getName(),ravi.getage(),ravi.breed,ravi.color);
    }
}
/*// Task
// Make a class Cat
// Make 2 private attribute name, age
// Make 2 public attribute breed, color
// Make a constructor to only set name and age
// Make getter for name and age
// Make a setter for age
// Make an Object of cat
// Fill the attributes
// Add +1 to the current age
// Print the Following using object
// Name: Ny
// Age: 4
// Breed: Xy
// Color: Orange  */
class Cat{
    private String name;
    private int age;
    public String breed,color;
    Cat(String name, int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getage(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }

}