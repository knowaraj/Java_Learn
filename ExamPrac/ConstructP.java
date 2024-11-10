package src.ExamPrac;
class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
}
class Child extends Parent{
    int id;
    Child(int id , String name){
        super(name);
        this.id = id;
    }
    void display(){
        System.out.println(name + id);
    }
}
public class ConstructP {
    public static void main (String[] args){
        Child o1 = new Child(1,"Ram");
        o1.display();
    }
}
