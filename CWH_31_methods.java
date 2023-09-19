public class CWH_31_methods {

    // static int logic (int x, int y) //in this we made the method static
    // {
    //     int z;
    //     if(x>y) {
    //         z = x+y;
    //     }
    //     else {
    //         z = x*y;
    //     }
    //     return z;
    // }
    // public static void main(String[] args) {
        
    //     int a1,b1,c1,a2,b2,c2;
    //     a1 = 3;
    //     b1 = 1;
    //     a2 = 4;
    //     b2 = 5;
    //     c1 = logic(a1, b1); //so here we can call it without creating object
    //     c2 = logic(a2, b2);
    //     System.out.println(c1);
    //     System.out.println(c2);
    // }

    // method invocation by object creation
    int logic (int x, int y) //if we don't create a static method
    {
        int z;
        if(x>y) {
            z = x+y;
        }
        else {
            z = x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        
        int a1,b1,c1,a2,b2,c2;
        a1 = 5;
        b1 = 2;
        a2 = 2;
        b2 = 5;
        CWH_31_methods obj = new CWH_31_methods(); //we will have to make a object and then call method
        c1 = obj.logic(a1, b1); 
        c2 = obj.logic(a2, b2);
        System.out.println(c1);
        System.out.println(c2);
        
    }
}