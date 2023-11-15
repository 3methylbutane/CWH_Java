/*
 * interfaces can extend another interface
 * (interface childInterface extends parentInterface) ✅✅✅
 * interface cannot implement another interface
 * (interface childInterface implements parentInterface) ❌❌❌
 */

interface parentInterface{
    void method1();
    void method2();
}

interface childInterface extends parentInterface{
    void method3();
    void method4();
}

class testClass implements childInterface{
    public void method1() {
        System.out.println("In Method1");
    }
    public void method2() {
        System.out.println("In Method2");
    }
    public void method3() {
        System.out.println("In Method3");
    }
    public void method4() {
        System.out.println("In Method4");
    }
}

public class CWH_58_inheritance_interfaces {
    public static void main(String[] args) {
        testClass tc = new testClass();
        tc.method1();
        tc.method2();
        tc.method3();
        tc.method4();
    }   
}
