package threading;

class OddThread extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error in " + Thread.currentThread().getName());
                }
                System.out.println( i);
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error in " + Thread.currentThread().getName());
                }
                System.out.println(i);
            }
        }
    }
}

public class OddEvenThreading {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();
    }
}
