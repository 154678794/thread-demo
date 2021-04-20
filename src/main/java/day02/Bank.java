package day02;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 15:45
 */
public class Bank extends Thread{
    private String nowWindows;

    private final static int max = 50;
    private static int index = 1;

    public Bank(String nowWindows) {
        this.nowWindows = nowWindows;
    }

    @Override
    public void run() {
        while (index <= 50){
            System.out.println("当前"+nowWindows+"窗口，"+index+"号");
            index++;
        }
    }
}
