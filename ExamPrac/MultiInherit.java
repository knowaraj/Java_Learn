package src.ExamPrac;
interface A {
    public void eat();
}
interface B{
    void cry();
}
class Baby implements A,B{
    public void eat(){
        System.out.println("he eats");
    }
    public void cry(){
        System.out.println("he cries");
    }
}
public class MultiInherit {
    public static void main(String[] args) {
        Baby o2 = new Baby();
        o2.cry();
        o2.eat();

    }
}
