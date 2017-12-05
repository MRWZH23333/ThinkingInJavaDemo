package demo10.practice6.temp3;

import demo10.practice6.temp1.TestRun;
import demo10.practice6.temp2.Outer;

public class OuterSon extends Outer {

    public static void main(String[] args) {
        OuterSon outerSon = new OuterSon();
        outerSon.getTestRun().testRun();
    }

    TestRun getTestRun(){

        System.out.println(num);

        return new Inner();
    }
}
