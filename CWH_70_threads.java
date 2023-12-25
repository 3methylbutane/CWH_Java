class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread1 is running");
            System.out.println("Mood is Happy");
        }  
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2 is running");
            System.out.println("Mood is Sad");
        } 
    }
}

public class CWH_70_threads {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.start();
        th2.start();
    }
    
}
