package demo7.practice;

public class Practice3 extends B{
    public static void main(String[] args) {
        Practice3 practice3 = new Practice3();
    }
}

class A{
    public A() {
        System.out.println("A");
    }
}

class  B extends  A{
    public B() {
        System.out.println("B");
    }
}
