package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/17 16:09:37
 */
public class InterruptCase3 {
    public static void main(String[] args) throws Exception {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("threadOne begin sleep for 2000 seconds");
                    Thread.sleep(2000000);
                    System.out.println("threadOne awake");
                } catch (Exception e) {
                    System.out.println("threadOne is interrupted while sleeping");
                    return;
                }
                System.out.println("threadOne leaving normally");
            }
        });
        //启动线程
        threadOne.start();
        //主线程休眠，确保子线程有足够的时间进入休眠状态
        Thread.sleep(1000);

        //打断子线程的休眠，让子线程从sleep函数返回
        threadOne.interrupt();
        //等待子线程执行完毕
        threadOne.join();
        System.out.println("main thread is over");

    }
}
