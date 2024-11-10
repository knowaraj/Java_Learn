package src.socketdemo;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Enter your name");
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();
            writer.println(num1);
            writer.println(num2);
            String result;
            while ((result = reader.readLine()) != null) {
                System.out.println(result);
            }
            System.out.println(result);
            socket.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
