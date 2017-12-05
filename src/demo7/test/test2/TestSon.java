package demo7.test.test2;

import java.util.Random;

public class TestSon extends TestFather {
    static {
        System.out.println("testSon");
    }

    public static void main(String[] args) {
        Random random = new Random(47);
    }
}
