package COLLEGE;

 class Mythread extends Thread{
    public void run() {
        for (int i = 0; i <10; i++) {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
class Mythread1 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i%2==1)
                System.out.println(i);

        }
    }
}
public class OwnThread {
    public static void main(String[] args) {
        Mythread thread = new Mythread();
        Mythread1 thread1 = new Mythread1();
        thread.start();
      //  thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
    }
}
