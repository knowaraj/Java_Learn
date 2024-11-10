package src;
import java.io.*;
import java.util.*;
public class Pall {
    public static void main(String[] args) {
       User[] users = new User[1];
       users[0] = new User(1,1);
    try (
                FileOutputStream fout = new FileOutputStream("user.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
        ) {
            objectOutputStream.writeObject(users);
        } catch (Exception e) {
            System.out.println("Error");
        }
        try (FileInputStream fis = new FileInputStream("user.txt");
            ObjectInputStream fin = new ObjectInputStream(fis)
        ){
            User[] read = (User[]) fin.readObject();
            System.out.println(read[0].age + "  " + read[0].id);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

class User implements Serializable{
    int id;
    int age;

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}