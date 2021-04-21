package day05;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 10:44
 */
//守护线程，http连接心跳检测,父线程结束子线程也就结束了
public class daemoThread {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            Thread daemoThread = new Thread(()->{
                try {
                    while(true){
                        Thread.sleep(1_000l);
                        System.out.println("heathly checking");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            daemoThread.setDaemon(true);
            daemoThread.start();
            try {
                Thread.sleep(5_000l);
                System.out.println("http connect finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
    }
}
