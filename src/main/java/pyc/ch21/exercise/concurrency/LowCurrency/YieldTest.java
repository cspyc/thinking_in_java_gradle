package pyc.ch21.exercise.concurrency.LowCurrency;


/**
 * @author pi
 * @date 2020/9/17 14:26:41
 */
public class YieldTest implements Runnable {

    public YieldTest() {
        //创建并启动线程
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //让出CPU执行权，放弃时间片，进行下一轮调试
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread() + " yield cpu...");

                //当前线程让出CPU执行权，放弃时间片，进行下一轮调试
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread()+" is over");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
