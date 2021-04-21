package day06;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 11:28
 */
//设置线程优先级
public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i<100 ; i++){
                Optional.of(Thread.currentThread().getName()+"_"+i).ifPresent(System.out::println);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0 ; i<100 ; i++){
                Optional.of(Thread.currentThread().getName()+"_"+i).ifPresent(System.out::println);
            }
        });
        Thread t3 = new Thread(()->{
            for (int i = 0 ; i<100 ; i++){
                Optional.of(Thread.currentThread().getName()+"_"+i).ifPresent(System.out::println);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
