package Lab;
interface A{
    default void Disp(){
        System.out.println("Displaying Without Ambiguity");
    }
}
interface B extends A{}
interface C extends A{}
class D implements B,C{}
public class MultipleInherit {
    public static void main(String[] args) {
        D object = new D();
        object.Disp();
    }
}
