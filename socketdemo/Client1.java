package src.socketdemo;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            writer.println(name);
            String convertedName = reader.readLine();
            System.out.println("Converted name: " + convertedName);
            socket.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
