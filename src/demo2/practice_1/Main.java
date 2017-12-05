package demo2.practice_1;

/**
 * @see Main
 * @author MR_WZH
 * @version 4.0
 * @deprecated
 */
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.number);
        System.out.println("name" + test.name);
    }
}

class Test{
    int number;
    char name;
}
