package demo9.practice;

public class Practice9 implements run{

    @Override
    public Son test1() {
        return new Son();
    }
}

interface run{
     Father test1();
}

class Father{

}

class  Son extends Father{

}