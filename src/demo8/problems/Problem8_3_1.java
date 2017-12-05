package demo8.problems;

public class Problem8_3_1 extends PortableLunch{

    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public Problem8_3_1() {
        System.out.println("Problem8_3_1");
    }

    public static void main(String[] args) {
        new Problem8_3_1();
    }
}

class Meal{
    static {
        System.out.println("static meal");
    }

    private TestString testString = new TestString("meal");

    public Meal() {
        System.out.println("meal");
    }
}

class Bread{
    static {
        System.out.println("static bread");
    }
    public Bread() {
        System.out.println("bread");
    }
}

class Cheese{
    static{
        System.out.println("static cheese");
    }
    public Cheese() {
        System.out.println("cheese");
    }
}

class Lettuce{
    static {
        System.out.println("static Lettuce");
    }
    public Lettuce() {
        System.out.println("lettuce");
    }
}

class Lunch extends Meal {
    static {
        System.out.println("static Lunch");
    }

    private TestString testString = new TestString("lunch");
    public Lunch() {
        System.out.println("lunch");
    }
}

class PortableLunch extends Lunch{
    private TestString testString = new TestString("PortableLunch");
    static {
        System.out.println("static PortableLunch");
    }

    public PortableLunch() {
        System.out.println("PortableLunch");
    }
}


class TestString{
    String name;
    public TestString(String name) {
        System.out.println(name);
    }
}