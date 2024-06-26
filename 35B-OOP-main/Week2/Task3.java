package Week2;

public class Task3 {
    public static void main(String[] args) {
        /* Write a program to print the area and perimeter of rectangle 
         * area = length * breadth
         * perimeter = 2 (length + breadth)
        */
    double length, breadth ,area, perimeter,volCuboid,volCube,height;
    length = 1020.55d;
    breadth= 1234.22d;
    height=1234.22d;
    area = length * breadth;
    perimeter = 2*(length + breadth);
    volCuboid = length*breadth*height;
    volCube= length*length*length;
    System.out.println("area = "+area);
    System.out.println("perimeter="+perimeter);
    System.out.println("volume of cuboid="+volCuboid);
    System.out.println("volume of cube-"+volCube);
    }
}
