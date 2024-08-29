package Lab;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("In Uppercase : " + name.toUpperCase());
    }
}
