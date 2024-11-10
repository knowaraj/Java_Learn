package src.ExamPrac;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/knowaraj/IdeaProjects/JavaClz/src/ExamPrac/copy.txt");
            FileOutputStream fout = new FileOutputStream("/home/knowaraj/IdeaProjects/JavaClz/src/ExamPrac/paste.txt");
            int a;
            while ((a= fin.read()) != -1){
                fout.write(a);
            }
            fin.close();
            fout.close();
        } catch (Exception e){
            System.out.println("Error");
        }

    }
}
