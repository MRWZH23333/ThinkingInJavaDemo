package demo9.test;

public class Test extends  TestFather implements TestInterface{

    public static void main(String[] args) {
        Test test = new Test();

        test.test();


    }
}


class TestFather{
    public void test(){
        System.out.println("testFather");
    }
}

interface TestInterface{
    void test();
}


