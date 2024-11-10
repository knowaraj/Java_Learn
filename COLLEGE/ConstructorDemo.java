package src.COLLEGE;

class Car{
    String color;
    int year;

     Car(){
        year=2020;
    }

    Car(String color , int year){
        this.color=color;
        this.year=year;
    }
    void display(){
        System.out.println(color+" "+year);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car("Lambo",2024);
        car.display();
        car1.display();
    }
}
