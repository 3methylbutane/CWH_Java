class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        while(true) {
            System.out.println("Running : " + this.getName());
        }
        
    }
}

public class CWH_74_thread_priorities {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 is most important");
        MyThread t2 = new MyThread("Thread 2 is least important");
        MyThread t3 = new MyThread("Thread 3");
        MyThread t4 = new MyThread("Thread 4");
        MyThread t5 = new MyThread("Thread 5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
