package demo7.test;

public final class Test1 {

    static {
        System.out.println("Test2 ");
    }

    private static Test2 test2 = new Test2();

    public static void main(String[] args) {

    }

    public final void test(){
        System.out.println("test ");

    }
}
