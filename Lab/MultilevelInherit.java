package Lab;
class GrandParent{
    void display(){
        System.out.println("Hi from Grandparent");
    }
}
class Parents extends GrandParent{
    void show(){
        System.out.println("Hi from Parent");
    }
}
class Child1 extends Parents{
    void meme(){
        System.out.println("CHILD");
    }
}
public class MultilevelInherit {
    public static void main(String[] args) {
        Child1 object = new Child1();
        object.meme();
        object.show();
        object.display();
    }


}
