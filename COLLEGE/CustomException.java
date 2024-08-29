package COLLEGE;

import java.util.Scanner;

class Myexception extends Exception {
    Myexception(String msg) {
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int a = scan.nextInt();
        try{
            marks(a);
        }catch (Myexception e) {
            System.out.println(e.getMessage());
        }
    }
     private static void marks(int a) throws Myexception{
        if(a<0)
            throw new Myexception("Error");
    }

}
