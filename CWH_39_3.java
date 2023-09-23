class Square {
    int side;
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 2*(side*side);
    }
}

class Rectangle {
    int length;
    int breadth;
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length*breadth);
    }
}

public class CWH_39_3 {
    public static void main(String[] args) {
        Square s = new Square();
        s.side=5;
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        Rectangle r = new Rectangle();
        r.length=2;
        r.breadth=5;
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
