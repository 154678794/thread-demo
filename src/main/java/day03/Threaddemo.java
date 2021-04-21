package day03;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 16:55
 */
//线程的构造方法
public class Threaddemo {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread("thread-name");
        Thread t3 = new Thread(()->{
            System.out.println("runnable");
        });
        Thread t4 = new Thread(()->{
            System.out.println("runnable"+Thread.currentThread().getName());
        },"runnable-name");
//        Thread t5 = new Thread();
        t1.start();
        System.out.println(t1.getName());
        t2.start();
        System.out.println(t2.getName());
        t3.start();
        t4.start();
    }
}
