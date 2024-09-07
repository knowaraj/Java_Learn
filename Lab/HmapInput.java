package Lab;
import java.util.*;
public class HmapInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        String[] arr;
        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your pet as CAT::KITTY : ");
            str = scan.nextLine();
            arr = str.split(":");
            hm.put(arr[0],arr[1]);
        }

        for(Map.Entry<String,String>entry:hm.entrySet()){
            //can add betetr language
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
