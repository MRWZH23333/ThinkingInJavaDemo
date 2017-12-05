package demo8.test.test1;

public class Food {
    private Bread bread = new Bread();
    private Beer beer = new Beer();
    public Food() {
        System.out.println("food");
    }

    public static void main(String[] args) {
        Food food = new Food();
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread");
    }
}

class Beer {
    public Beer() {
        System.out.println("beer");
    }
}
