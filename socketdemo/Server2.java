package src.socketdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int num1 = Integer.parseInt(reader.readLine());
            int num2 = Integer.parseInt(reader.readLine());
            String result = Operations(num1, num2);
            writer.println(result);
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    private static String Operations(int num1, int num2) {
        StringBuilder result = new StringBuilder();
        result.append("Addition result: ").append(num1 + num2).append("\n");
        result.append("Subtraction result: ").append(num1 - num2).append("\n");
        result.append("Multiplication result: ").append(num1 * num2).append("\n");
        if (num2 != 0) {
            result.append("Division result: ").append((double) num1 / num2).append("\n");
        } else {
            result.append("Division result: Error - Division by zero is not allowed!\n");
        }
        return result.toString();
    }
}
