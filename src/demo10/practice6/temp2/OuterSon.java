package demo10.practice6.temp2;

import demo10.practice6.temp1.TestRun;

public class OuterSon extends Outer{
    TestRun getTestRun(){
        new Inner();
        return this.new Inner();
    }
}
