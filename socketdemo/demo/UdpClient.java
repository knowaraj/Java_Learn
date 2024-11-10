package src.socketdemo.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String str = "Welcome java";
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            ds.send(dp);

            byte[] buf = new byte[1024];
            DatagramPacket receivedPacket = new DatagramPacket(buf, 1024);
            ds.receive(receivedPacket);
            System.out.println(new String(receivedPacket.getData(), 0, receivedPacket.getLength()));
            ds.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}


