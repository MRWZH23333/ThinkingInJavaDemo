package demo3.Test;

public class Test_1 {
    public static void main(String[] args) {
        String s = new String("hello");
        setNull(s);
        System.out.println(s);
        char c = 'a';
        System.out.println("beforeSet c = "+ c);
        setChar(c);
        System.out.println("c  = "+ c);
    }

    public static void setNull(String s) {
        s = null;
    }

    public static void setChar(char c) {
        c = 'z';
    }
}
