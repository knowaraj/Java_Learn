package Lab;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        String str;
        String rev = "";
        System.out.println("Enter your String : ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            rev= rev + str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("The String is Palindrome");
        }
        else
            System.out.println("Its not Palindrome");
    }

}
