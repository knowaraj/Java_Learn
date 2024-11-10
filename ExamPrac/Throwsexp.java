package src.ExamPrac;

import java.util.SortedMap;

class OwnExp extends Exception{
    OwnExp(String msg){
        super(msg);
    }
}
public class Throwsexp {
    public static void main(String[] args) {
        try {
            marks(-3);
        } catch (OwnExp e) {
            System.out.println(e +" "+ "error");
        }
    }
    public static void marks(int m) throws OwnExp {
        if (m<=0){
            throw new OwnExp("error");
        }
    }
}
