package demo4.test;

public class Test_1 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5) {
                    continue outer;
                } else {
                    System.out.println(" i  " + i + " j " + j);
                }
            }
        }
    }
}
