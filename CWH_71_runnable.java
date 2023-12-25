class MyThread1 implements Runnable{
    public void run() {
        System.out.println("Thread 1 is running!");
    }
}

class MyThread2 implements Runnable{
    public void run() {
        System.out.println("Thread 2 is running!");
    }
}

public class CWH_71_runnable {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        Thread t1 = new Thread(th1);

        MyThread2 th2 = new MyThread2();
        Thread t2 = new Thread(th2);
        
        t1.start();
        t2.start();
    }
    
}