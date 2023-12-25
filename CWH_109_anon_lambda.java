interface DemoAnony {
    void meth1();
    void meth2();
}

@FunctionalInterface //-> functional interface always contains one method
interface DemoLambda {
    void meth(int a);
}

// class AnonyDemo implements DemoAnony {
//     public void display() {
//         System.out.println("Hello");
//     }

//     @Override
//     public void meth1() {
//         System.out.println("In method 1");
//     }

//     @Override
//     public void meth2() {
//         System.out.println("In method 2");
//     }
// }

//Now insted of making a new class just for one implemenation, we can make anonymous classes
public class CWH_109_anon_lambda {
    public static void main(String[] args) {
        //Anonymous class
        // DemoAnony obj = new AnonyDemo();
        // obj.meth1();

        // DemoAnony obj2 = new DemoAnony() {
        //     @Override
        //     public void meth1() {
        //         System.out.println("In method 1 of anonymous class");
        //     }

        //     @Override
        //     public void meth2() {
        //         System.out.println("In method 2 of anonymous class");
        //     }
        // };
        // obj2.meth2();

        //Lambda Expressions
        DemoLambda obj3 = (a)-> {
            System.out.println("In Lambda Method " + a);
        };
        obj3.meth(34);
    }
}
