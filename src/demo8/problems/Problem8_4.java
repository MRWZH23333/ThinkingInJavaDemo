package demo8.problems;

public class Problem8_4 {

}

class Father{
    String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
class Son extends  Father{

    public Son(String name) {
        super(name);
    }
}

class GenFather{
    public  Father gen(){
      return new Father("father");
    };
}

class  GenSon extends GenFather{
    @Override
    public Son gen() {
        return new Son("son");
    }
}
