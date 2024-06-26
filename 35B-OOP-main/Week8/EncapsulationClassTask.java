package Week8;

public class EncapsulationClassTask {
    public static void main(String[] args) {
        Laptop mal= new Laptop("Apple", "Apple Air M3");
        Laptop prod= new Laptop("Lenovo", "Ideapad 3");
        prod.price=60000;
        prod.year=2016;
        prod.setRam(10);
        prod.setStorage(500);
        mal.price=140000;
        mal.year=2022;
        mal.setRam(8);
        mal.setStorage(120);
        mal.upgrade(2, 136);
        mal.inflation(10000);
        prod.upgrade(6, 500);
        prod.inflation(30000);
        System.out.printf("Brand: %s\nName: %s\nPrice: %d\nRam: %d\nStorage: %d\nYear: %d\n",mal.brand,mal.name,mal.price,mal.getRam(),mal.getStorage(),mal.year);
    }
}
// Task 
    // Make a constructer of Laptop that takes brand and name
    // Make a setter and getter for remaining private attributes, ram, storage
    // Make a function upgrade() takes, 2 number for ram and storage \
    // and add them to the current value of ram and storage
    // Make a function inflation() takes 1 number price \
    // and add to the current value of price
    // Make 2 object, fill the attribute and call upgrade & inflation
    // Print the following
    // Output
    // Brand: Apple
    // Name: Apple Air M3
    // Price: 150000
    // Ram: 10GB
    // Storage: 256GB
    // Year: 2022 

class Laptop{

        Laptop(String brand,String name){
            this.brand=brand;
            this.name=name;
        }
        String brand,name;
        int price,year;
        private int ram,storage;
        public void setRam(int ram){
            this.ram= ram;
        }
        public void setStorage(int storage){
            this.storage=storage;
        }
        public int getRam(){
            return ram;
        }
        public int getStorage(){
            return storage;
        }
        public void upgrade(int num1,int num2){
            this.ram+=num1;
            this.storage+=num2;
        }
        public void inflation(int inf){
            this.price+=inf;
        }
    }