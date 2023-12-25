class MyThread1 extends Thread {
    public void run() {
        int i=1;
        while(i<100) {
            System.out.println("Running Thread 1");
            try {
                sleep(50);
            }
            catch (Exception e)  {
                System.out.println(e);
            }
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i=1;
        while(i<100) {
            System.out.println("Running Thread 2");
            i++;
        }
    }
}

public class CWH_75_thread_methods {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th1.start();
        // try {
        //     th1.join();
        // }
        // catch (Exception e) {
        //     System.out.println(e);
        // }
        th2.start();
    }
}
