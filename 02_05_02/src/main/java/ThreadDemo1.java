public class ThreadDemo1 {
    public static void main(String args[]) throws Exception {
        new TestThread1().start();
        while (true) {
            System.out.println("main thread is running");
            Thread.sleep(1000);
        }
    }
}

class TestThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println(" TestThread1 is running");
            try {
                Thread.sleep(1000); //1000毫秒
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
