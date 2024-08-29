package threading;

class MyOdd implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i%2 ==1)
                System.out.println(i);
        }
    }
}

class MyEven implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i%2 ==0)
                System.out.println(i);
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyOdd());
        Thread t2 = new Thread(new MyEven());
        t1.start();
        t2.start();
    }
}

