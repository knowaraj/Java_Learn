package rmidemo;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            Greeting remote = (Greeting)  registry.lookup("name");
           String value = remote.sayHello();
            System.out.println(value);

        } catch (Exception e){
            System.out.println("Error");
        }

    }
}
