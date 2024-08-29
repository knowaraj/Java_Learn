package Lab;
class Car{
    int year;
    String name;

    Car(int year,String name){
        this.year=year;
        this.name=name;
    }
}
class Tesla extends Car{
    String color;

    Tesla(int a , String b , String c){
        super(a,b);
        color=c;
    }
    void display(){
        System.out.println("Year : "+year+" Name : "+name+" Color : "+color);
    }
}


public class ConstructorChain {
    public static void main(String[] args) {
        Tesla obj = new Tesla(1999 , "Urus", "Yellow");
        obj.display();
    }
}
