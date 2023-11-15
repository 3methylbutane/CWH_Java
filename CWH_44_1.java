/*
    Create a class cylinder and use getters and setters to set its radius and height
    Find its SA and vol

 */

class Cylinder {
    private int radius;
    private int height;
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
public class CWH_44_1 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setHeight(10);
        System.out.println("Height of cylinder is : " + cy.getHeight());
        cy.setRadius(5);
        System.out.println("Radius of cylinder is : " + cy.getRadius());
        System.out.println("Surface Area of cylinder is : " + cy.surfaceArea());
        System.out.println("Volume of cylinder is : " + cy.Volume() );
    }
}
