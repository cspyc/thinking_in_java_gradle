package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/17 15:49:13
 */
public class InterruptCase2 {
    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //如果当前线程被中断则退出循环
                while(!Thread.currentThread().isInterrupted()){
                    System.out.println(Thread.currentThread() + " Hello");
                }
            }
        });

        //启动子线程
        thread.start();
        //主线程休眠1s，以便中断前让子线程输出
        Thread.sleep(1000);

        //中断子线程
        System.out.println("main thread interrupt thread");
        thread.interrupt();

        //等待子线程执行完毕
        thread.join();
        System.out.println("main is over");
    }
}
