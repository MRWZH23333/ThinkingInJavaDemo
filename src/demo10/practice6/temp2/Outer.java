package demo10.practice6.temp2;

import demo10.practice6.temp1.TestRun;

public class Outer {

    protected  int num ;
    protected  class  Inner implements TestRun{
        @Override
        public void testRun() {
            System.out.println("Inner testRun");
        }
    }
}
