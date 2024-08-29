package exception;
import java.util.Scanner;

class InvalidMarks extends Exception {
    InvalidMarks(String msg) {
        super(msg);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Enter a marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        try{
           checkMarks(marks);
        } catch (InvalidMarks e) {
            System.out.println(e.getMessage());
        }

    }

    private static void checkMarks(int marks) throws InvalidMarks {
        if(marks<=0) {
            throw new InvalidMarks("Invalid Marks");
        }
    }
}
