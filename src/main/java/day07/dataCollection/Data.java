package day07.dataCollection;

import java.text.SimpleDateFormat;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 14:34
 */
public class Data {
    static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DataCollections("t1" , 1000));
        Thread t2 = new Thread(new DataCollections("t2" , 5000));
        Thread t3 = new Thread(new DataCollections("t3" , 1000));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("all finished end time:"+sf.format(System.currentTimeMillis()));
    }
}
