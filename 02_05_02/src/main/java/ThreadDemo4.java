public class ThreadDemo4 {
    public static void main(String[] args) {
        TestThread4 t = new TestThread4();
        t.start();
//        t.start();
//        t.start();
//        t.start();
        TestThread4 t1 = new TestThread4();
        t1.start();
    }
}

class TestThread4 extends Thread {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000); //1000毫秒
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
