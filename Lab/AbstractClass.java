package Lab;

abstract class Animal{
    public abstract void eat ();
    public void sleep()
    {
        System.out.println("Animal sleep");
    }
}
class Dog extends  Animal{
    public void eat ()
    {
        System.out.println("Dog eats  ");
    }
}
class Elephant extends  Animal{
    public void eat ()
    {
        System.out.println("Elephant eats ");
    }
}

public class AbstractClass{
    public static void main (String [] args){
        Animal obj= new Elephant();
        obj.eat();
        obj= new Dog();
        obj.eat();

    }

}