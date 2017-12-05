package demo8.practice.practice10;

public class Practice10_Son extends Practice10 {
    @Override
    public void test2() {
        System.out.println("Practice10_Son");
    }

    public static void main(String[] args) {
        Practice10 practice10 = new Practice10_Son();
        practice10.test1();
    }
}
