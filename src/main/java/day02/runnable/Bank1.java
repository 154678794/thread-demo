package day02.runnable;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 16:07
 */
public class Bank1 implements Runnable{

    private final static int max = 50;
    private int index = 1;

    @Override
    public void run() {
        while (index <= max){
            System.out.println(Thread.currentThread()+"窗口，"+index+"号");
            try {
                Thread.sleep(100l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            index++;
        }
    }
}
