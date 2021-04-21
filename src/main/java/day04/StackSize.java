package day04;

/**
 * TODO
 *
 * @author admin
 * @version 1.0
 * @date 2021/4/21 9:12
 */
//线程中线程栈的大小
public class StackSize {
    private static int count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(null, new Runnable() {
            @Override
            public void run(){
                try {
                    add(1);
                }catch (Error e){
                    e.printStackTrace();
                    System.out.println(count);
                }
            }
        }, "stackSize", 1>>23);
        t1.start();
    }
    public static void add(int i){
        count++;
        i++;
        add(i);
    }
}
