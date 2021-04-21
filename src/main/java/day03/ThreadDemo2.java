package day03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 17:18
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(100l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        ThreadGroup temp = t.getThreadGroup();
        Thread[] threads = new Thread[temp.activeCount()];
        temp.enumerate(threads);//数据复制
        Arrays.asList(threads).forEach(System.out::println);
    }
}
