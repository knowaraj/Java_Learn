package Lab;
class Parent {

    Parent(){
        System.out.println("Parent's Constructor");
    }
}
class Child extends Parent {
    Child(){
        System.out.println("Child's Constructor");

    }
}

public class DefaultCall {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
