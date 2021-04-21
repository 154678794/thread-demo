package day06;

import java.util.Optional;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 11:19
 */
//java8 Option
public class SimpleApi {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            Optional.of(Thread.currentThread().getName()).ifPresent(System.out::println);
        });

        t.start();
        Optional.of(t.getName()).ifPresent(System.out::println);
        Optional.of(t.getId()).ifPresent(System.out::println);
        Optional.of(t.getPriority()).ifPresent(System.out::println);
    }
}
