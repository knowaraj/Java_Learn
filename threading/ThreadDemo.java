package threading;

public class ThreadDemo extends Thread{

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for(int i=0; i<10; i++) {

            ThreadDemo threadDemo = new ThreadDemo();
            threadDemo.start();
        }
    }
}
