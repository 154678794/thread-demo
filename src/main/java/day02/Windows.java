package day02;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 15:46
 */
//一个报号器，二个窗口
public class Windows {
    public static void main(String[] args) {
        Bank bank = new Bank("A");
        bank.start();

        Bank bank1 = new Bank("B");
        bank1.start();
    }
}
