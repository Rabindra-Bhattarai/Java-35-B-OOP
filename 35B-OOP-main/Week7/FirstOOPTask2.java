package Week7;

public class FirstOOPTask2 {
    public static void main(String[] args) {
        car car1=new car();
        car1.name="Lancer Evo X";
        car1.brand="Mitshubishi";
        car1.color="Red";
        car1.year=2015;
        car car2=new car();
        car2.name="Supra";
        car2.brand="Toyota";
        car2.color="white";
        car2.year=2005;
        car car3=new car();
        car3.name="RX7";
        car3.brand="Mazda";
        car3.color="Black";
        car3.year=207;

        car1.start();
        car2.start();
        car3.start();

        car1.stop();
        car2.modify("Green");
        System.out.println(car3.expiry());
        car1.detail();
        car2.detail();
        car3.detail();
    }


    
}
class car{
    /*
     * mazke attribute: name , brand, year,color
     * make a function modify() that thakes new color and set to old color
     * make a function expiry() that returns 100 added to year
     * make a function start() that prints(name is starting)
     * make a function stop() that prints(name, brand is stoping)
     * make a function detail() that prints(name, brand, color and year)
     * make 3 object of car
     * start all 3 objects
     * stop only 1st object 
     * mmodify 2nd car to green color
     * print the expiry of 3rd object
     * print detail of all 3 object 
     */

     String name,brand,color;
     int year;
     void modify(String colour){
        color=colour;
     }
     int expiry(){
        return year+100;
     }
     void start(){
        System.out.println(name +" is starting");
     }
     void stop(){
        System.out.println(name+", "+brand + " is stoping");
     }
     void detail(){
        System.out.println(name+" "+brand+" "+color+" "+year );
     }
}
