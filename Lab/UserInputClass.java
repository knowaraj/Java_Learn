package Lab;

import java.util.Scanner;

class User{
    String name;
    String address;
    String email;
    int age;

    void setvalue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        name = scan.nextLine();
        System.out.println("Enter your Address : ");
        address = scan.nextLine();
        System.out.println("Enter your Email : ");
        email = scan.nextLine();
        System.out.println("Enter your Age : ");
        age = scan.nextInt();
    }
    void display(){
        System.out.println("Name: "+name+" Address: "+address+" Email: "+email+" Age: "+age);
    }
}
public class UserInputClass {
    public static void main(String[] args) {
        User obj = new User();
        obj.setvalue();
        obj.display();
    }
}
