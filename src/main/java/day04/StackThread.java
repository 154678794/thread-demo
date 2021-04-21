package day04;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 9:52
 */
//线程数量
public class StackThread {
    private static int count = 0;
    public static void main(String[] args) {
        for (int i = 0 ; i<Integer.MAX_VALUE;i++){
            count++;
            new Thread(()->{
                try {
                    Byte[] b = new Byte[1024*1024];
                    add(0);
                }catch(Error e){
                    e.printStackTrace();
                    System.out.println(count);
                }
            }).start();
        }
    }
    public static void add(int i){
        i++;
        add(i);
    }
}
