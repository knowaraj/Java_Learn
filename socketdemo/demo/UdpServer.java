package src.socketdemo.demo;

import java.net.*;

public class UdpServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(str);

            String message = "Welcome from Server";
            DatagramPacket senderPacket = new DatagramPacket(message.getBytes(), message.length()
                    , dp.getAddress(), dp.getPort());
            ds.send(senderPacket);
            ds.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

