package rmidemo;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try{
            GreetingIml obj = new GreetingIml();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("name", obj);
            System.out.println("Server is running...");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
