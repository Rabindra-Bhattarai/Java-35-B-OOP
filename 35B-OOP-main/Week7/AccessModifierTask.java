package Week7;

public class AccessModifierTask {
   public static void main(String[] args) {
    dog momo=new dog();
    momo.setAge(10);
    momo.setName("XYZ");
    momo.breed="ABC";
    System.out.printf("Name = %s\nBreed= %s\nAge= %d\n",momo.getName(),momo.breed,momo.getAge());

   } 
}
//// Task 
// Make a class Dog
// Make a private attribute name and age
// Make a public attribute breed
// Make setter for name and age
// Make getter for name and age
// Make an Object for dog
// Fill all attribute
// Print the following using object
// Name: XYZ
// Breed: ABC
// Age: 10 

class dog{
    private String name;
    private int age;
    public String breed;
    void setName(String Name){
        name=Name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
