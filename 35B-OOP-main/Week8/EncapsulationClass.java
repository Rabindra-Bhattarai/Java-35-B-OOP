package Week8;

public class EncapsulationClass {
    
}
/*1. encapsultaion encloses/bundles similar properties/attributes
 * and function/methods inside a single class
 */

 class Laptop{
    String brand;
    String name;
    //2 data hiding can be done using private modifier
    private double price;
    private int ram;
    private int storage;
    private int year;
    //3 data attributes can have a better control using setter/getter
    //write only using setter
    public void setPrice(double price){
        this.price=price;
    }
    //readonly using getter
    public double getPrice(){
        return this.price;
    }
    void branding(){
        System.out.println("Brand :"+brand);
    }
 }