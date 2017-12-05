package demo5.test;

public class Test1 {
    public static void main(String[] args) {
        test1("1",1);
        test2(1, "2");

        Test1 test1 = new Test1();
        test1 = null;

        System.gc();
    }

    private static void test1(String name, int num) {
        System.out.println("test1");
    }


    private static void test2(int num, String name) {
        System.out.println("test2");
    }

    private void recycle() {
        try {
            this.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("this you silly b");
    }
}
