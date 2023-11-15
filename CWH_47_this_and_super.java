/* this: this is a way for us to reference an object of the class 
   which is being created/refrenced.

   super: a reference variable used to refer immediate parent class object
   - can be used to refer immediate parent class instance variable
   - can be used to invoke parent class methods
   - can be used to invoke parent class constructors
*/

class Random{
    int a;
    Random(int v) {
        this.a = v;
    }
    public int getA() {
        return a;
    }
}

class Random_2 extends Random{
    Random_2(int x) {
        super(x);
        System.out.println("I am constructor");
    }
}


public class CWH_47_this_and_super {
    public static void main(String[] args) {
        Random rn = new Random(45);
        Random_2 rn2 = new Random_2(1000);
        System.out.println(rn.getA());
    }
}
