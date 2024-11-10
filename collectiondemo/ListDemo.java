package src.collectiondemo;

import java.io.ObjectOutputStream;
import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        
        Set<String> myList = new LinkedHashSet<>();
        myList.add("apple");
        myList.add("ball");
        myList.add("cat");
        myList.add("cat");
        myList.add("ant");

        System.out.println("Size = " + myList.size());
        System.out.println("IsEmpty = " + myList.isEmpty());
        System.out.println("Contains = " + myList.contains("Dog"));
        myList.remove("ball");

    for(String str : myList) {
        System.out.println(str);
    }
    }

}