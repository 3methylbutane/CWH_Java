class classA{
    public void meth1(){
        System.out.println("Method 1 of class A");
    }
    public void meth2(){
        System.out.println("Method 1 of class A");
    }
}

class classB extends classA{
    @Override
    public void meth2(){
        System.out.println("Method 2 of class B");
    }
    public void meth3(){
        System.out.println("Method 3 of class B");
    }
}

public class CWH_48_method_overriding {
    public static void main(String[] args) {
        classA cA = new classA();
        cA.meth1();
        classB cB = new classB();
        cB.meth2();
    }
}
