package Week10;

public class AbstractClassTask {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=100.98d;
        System.out.println("Area = "+c.calculateArea());
        System.out.println("Perimeter= "+ c.calculatePerimeter());
        Rectangle r=new Rectangle();
        r.length=100.98d;
        r.breadth=300.22d;
        System.out.println("Area = "+r.calculateArea());
        System.out.println("Perimeter= "+ r.calculatePerimeter());
        Triangle t=new Triangle();
        t.base=100.98d;
        t.height=300.22d;
        t.side1=150.98d;
        t.side2= 133.11d;
        System.out.println("Area = "+t.calculateArea());
        System.out.println("Perimeter= "+ t.calculatePerimeter());

    }
}
/*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/ 
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape{
    double radius;
    @Override
    double calculateArea(){
        return (22/7)*radius*radius;
    }
    @Override
    double calculatePerimeter(){
        return 2*(22/7)*radius;
    }
}

class Rectangle extends Shape{
    double length,breadth;

    @Override
    double calculateArea(){
        return length*breadth;
    }
    @Override
    double calculatePerimeter(){
        return 2*(length+breadth);
    }
}

class Triangle extends Shape{
    double base,height,side1,side2;
    @Override
    double calculateArea(){
        return 0.5*base*height;
    }
    @Override
    double calculatePerimeter(){
        return base+height+side1+side2;
    }

}
