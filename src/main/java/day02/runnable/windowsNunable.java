package day02.runnable;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 16:09
 */
public class windowsNunable{
    public static void main(String[] args) {
        final Bank1 bank1 = new Bank1();
        Thread t1 = new Thread(bank1,"A");
        Thread t2 = new Thread(bank1,"B");
        Thread t3 = new Thread(bank1,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
