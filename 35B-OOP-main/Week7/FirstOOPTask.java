package Week7;

/* Task
 * make a class rectangle
 * make 2 attributes in double length and breadth
 * make a function areaOfRectangle that returns length * breadth 
 * make a fuction perimeterOfRectangle the returns 2*(length * breadth)
 * make an object of rectangle and print area and perimeter
 */



public class FirstOOPTask {
    public static void main(String[] args) {
        rectangle a= new rectangle();
        a.length=10.5d;
        a.breadth=45.6d;
        System.out.println(a.areaOfRectangle());
        System.out.println(a.perimeterOfRectangle());
    }
}

class rectangle{
    double length,breadth;
    double areaOfRectangle(){
        return length*breadth;
    }
    double perimeterOfRectangle(){
        return 2*(length+breadth);
    }
}

