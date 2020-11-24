package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/18 10:56:16
 */
public class DeadLockCase {
    //创建资源
    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) throws Exception {
        //创建线程A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + " get ResourceA");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + " waiting get resourceB");

                    //释放资源

                    synchronized (resourceB) {
                        System.out.println(Thread.currentThread() + " get resourceB");
                    }
                }
            }
        });

        //创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceB) {
                    System.out.println(Thread.currentThread() + " get ResourceB");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + " waiting get resourceA");

                    //释放资源
                    
                    synchronized (resourceA) {
                        System.out.println(Thread.currentThread() + " get ResourceA");
                    }
                }
            }
        });

        //启动线程
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("main thread over");
    }
}
