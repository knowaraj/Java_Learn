package src.ExamPrac;
class Myth extends Thread{
    public void run(){
        System.out.println("hi");
    }
}
public class CustThread {
    public static void main(String[] args) {
        Thread t1 = new Myth();
        t1.start();
    }
}
