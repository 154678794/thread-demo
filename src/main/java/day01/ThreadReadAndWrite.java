package day01;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/20 15:20
 */
//读数据库时同时写入文件
public class ThreadReadAndWrite {


    public static void main(String[] args) {
        Thread t1 = new Thread("read-thread"){
            @Override
            public void run(){
                System.out.println("开始读取数据库");
                System.out.println("读取数据库中...");
                try {
                    sleep(10_000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("读取数据库结束");
            }
        };

        Thread t2 = new Thread("write-thread"){
            @Override
            public void run(){
                System.out.println("开始写入文件");
                System.out.println("写入文件中...");
                try {
                    sleep(20_000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("写入文件结束");
            }
        };

        t1.start();
        t2.start();
    }
}
