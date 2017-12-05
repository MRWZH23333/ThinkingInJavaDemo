package demo10.practice;

public class Practice4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence("test");
        Sequence.SequenceSelector sequenceSelector = sequence.new SequenceSelector();
        String name = sequenceSelector.getOuterRef().getName();
        System.out.println(name);
    }
}

class Sequence{
    String name;

    public Sequence(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    class SequenceSelector{
        public Sequence getOuterRef(){
            return Sequence.this;
        }
    }
}
