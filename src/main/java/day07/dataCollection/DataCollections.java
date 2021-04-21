package day07.dataCollection;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 14:29
 */
public class DataCollections implements Runnable{
    private String machineName;

    public DataCollections(String machineName, long spendTime) {
        this.machineName = machineName;
        this.spendTime = spendTime;
    }

    private long spendTime;

    @Override
    public void run() {
        try {
            Thread.sleep(spendTime);
            System.out.println(machineName+"spend time:"+spendTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
