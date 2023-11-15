/*
    Create a class cylinder and use getters and setters to set its radius and height
    Find its SA and vol
    Create a constrcutor to take Cylinder dimensions

 */

class Cylinder {
    private int radius;
    private int height;
    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea() {
        return 2*Math.PI*radius*radius + 2*3.14*radius*height;
    }
    public double Volume() {
        return Math.PI*radius*radius*height;
    }

}

class Rectangle{
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    

}
public class CWH_44_3 {
    public static void main(String[] args) {
        // Cylinder cy = new Cylinder(10,5);
        // System.out.println("Height of cylinder is : " + cy.getHeight());
        // System.out.println("Radius of cylinder is : " + cy.getRadius());
        // System.out.println("Surface Area of cylinder is : " + cy.surfaceArea());
        // System.out.println("Volume of cylinder is : " + cy.Volume() );

        Rectangle rc = new Rectangle(10, 5);
        System.out.println("Length of Rectangle is : " + rc.getLength());
        System.out.println("Breadth of Rectangle is : " + rc.getBreadth());
    }
}
