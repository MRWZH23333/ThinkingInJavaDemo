package demo9.practice;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class Practice18 {
    public static void main(String[] args) {
        CycyleFactory cycyleFactory1 = new UniCycleFactory();
        CycyleFactory cycyleFactory2 = new BicycleFactory();
        CycyleFactory cycyleFactory3 = new TriCycleFactory();
        cycyleFactory1.getCycle().cycle();
        cycyleFactory2.getCycle().cycle();
        cycyleFactory3.getCycle().cycle();
    }
}

interface Cycle{
    void cycle();
}

class UniCycyle implements Cycle{

    @Override
    public void cycle() {
        System.out.println("UniCycyle");
    }
}


class  Bicycle implements  Cycle{

    @Override
    public void cycle() {
        System.out.println("Bicycle");
    }
}

class TriCycle implements Cycle{

    @Override
    public void cycle() {
        System.out.println("TriCycle");
    }
}

interface CycyleFactory{
    Cycle getCycle();
}

class UniCycleFactory implements CycyleFactory{

    @Override
    public Cycle getCycle() {
        return new UniCycyle();
    }
}

class BicycleFactory implements CycyleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TriCycleFactory implements CycyleFactory{

    @Override
    public Cycle getCycle() {
        return new TriCycle();
    }
}
