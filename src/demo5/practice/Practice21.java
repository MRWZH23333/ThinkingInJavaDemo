package demo5.practice;

public class Practice21 {

    enum Money{
        YUAN,
        JIAO,
        FEN,
        SHI_YUAN,
        ER_SHI_YUAN,
        YI_BAI_YUAN,
    }
    public static void main(String[] args) {
        for (Money money:Money.values()) {
            System.out.println("Money  "+ money.ordinal());
        }
    }
}
