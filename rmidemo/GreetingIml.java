package rmidemo;

import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class GreetingIml extends UnicastRemoteObject implements Greeting{

    public GreetingIml() throws RemoteException {
        super();
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Hello from Server";
    }
}
