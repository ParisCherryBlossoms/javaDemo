package daemon;

public class ThreadDemo4 {
    public static void main(String args[]) throws InterruptedException {
        TestThread4 t = new TestThread4();
        t.setDaemon(true);
        t.start();
        Thread.sleep(2000);
        System.out.println("main thread is exiting");
    }
}

class TestThread4 extends Thread {
    public void run() {
        while (true) {
            System.out.println("TestThread4" +
                    "　is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
