package demo9.practice;

import sun.security.smartcardio.SunPCSC;

import java.util.Random;

public class Practice19 {
    public static void main(String[] args) {
        DiceFactory diceFactory = new NormalDiceFactory();
        Dice dice  = diceFactory.getDice();
        for (int i = 0;i<10;i++) {
            System.out.println("i = " + dice.randomNumber());
        }
    }
}

interface Dice {
    int randomNumber();
}

interface DiceFactory {
    Dice getDice();
}

class NormalDice implements Dice {

    @Override
    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

class  NormalDiceFactory implements DiceFactory{

    @Override
    public Dice getDice() {
        return new NormalDice();
    }
}
