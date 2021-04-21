package day07;

import java.util.stream.IntStream;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 14:02
 */
//join子线程完成后父线程才执行
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            IntStream.range(1,100).forEach(i -> System.out.println(Thread.currentThread().getName()+i));
        });
        t.start();
        t.join();//多少秒后父线程执行
        IntStream.range(1,100).forEach(i -> System.out.println(Thread.currentThread().getName()+i));


        //等待主线程main结束，故程序不结束
//        Thread.currentThread().join();
    }
}
