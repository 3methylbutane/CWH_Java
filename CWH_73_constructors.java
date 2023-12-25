class MyThread extends Thread{
    public void run() {
        System.out.println("Thread 1 is running!");
    }
    public MyThread(String name) {
        super(name);
    }
}

class MyThread2 extends Thread{
    public void run() {
        System.out.println("Thread 2 is running");
    }
    public MyThread2(Runnable thread, String name){
        super(thread,name);
    }
}

public class CWH_73_constructors {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("Thread 1");
        Thread r1 =  new Thread(th1);
        System.out.println("Id of thread 1 is : " + th1.getId());
        System.out.println("Name is : " + th1.getName());
        r1.start();

        MyThread2 th2 = new MyThread2(r1,"Thread 2");
        System.out.println("Id of thread 2 is : " + th2.getId());
        System.out.println("Name of thread 2 is : " + th2.getName());
        th2.start();
    }
}
