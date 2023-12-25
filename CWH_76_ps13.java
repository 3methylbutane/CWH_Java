class MyThread1 extends Thread {
    public void run() {
        System.out.println("Good Morning!");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Good Night!");
    }
}

public class CWH_76_ps13 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getState());
    }
}
