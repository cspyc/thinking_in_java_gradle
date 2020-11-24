package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/17 13:07:36
 */
public class InterruptCase {
    public static void main(String[] args) {
        //线程one
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadOne begin run!");
                for(;;){}
            }
        });

        //获取主线程
        final Thread mainThread = Thread.currentThread();

        //线程two
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                //休眠1s
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                //中断主线程
                mainThread.interrupt();
//                threadOne.interrupt();
            }
        });
        //启动子线程
        threadOne.start();
        //延迟1s启动线程
        threadTwo.start();
        //等待线程one执行结束
        try{
            threadOne.join();
        }catch (Exception e){
            System.out.println("main thread: " + e);
        }
    }
}
