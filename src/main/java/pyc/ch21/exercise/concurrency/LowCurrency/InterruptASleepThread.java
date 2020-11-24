package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/17 13:44:15
 */
public class InterruptASleepThread {
    public static void main(String[] args) throws Exception {
        //创建线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("child tread is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child thread is in awake");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        //启动线程
        thread.start();
        //主线程休眠2s
        Thread.sleep(2000);

        //在主线程中，中断休眠状态的子线程
        thread.interrupt();
    }
}
