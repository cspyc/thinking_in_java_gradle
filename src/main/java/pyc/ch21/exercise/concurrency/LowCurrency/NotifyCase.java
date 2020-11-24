package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/17 10:37:26
 */
public class NotifyCase {
    //创建资源
    private static volatile Object resourceA = new Object();

    public static void main(String[] args) throws Exception {
        //创建线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                //获取resourceA共享资源的监视器锁
                synchronized (resourceA) {
                    System.out.println("threadA get resourceA lock");

                    try {
                        System.out.println("threadA begin wait");
                        resourceA.wait();
                        System.out.println("threadA end wait");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println("threadB get resourceA lock");
                    try {
                        System.out.println("threadB begin wait");
                        resourceA.wait();
                        System.out.println("threadB end wait");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //创建线程C
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println("threadC get resourceA lock");
                    try {
                        System.out.println("threadC begin notify");
//                        resourceA.notify();
                        resourceA.notifyAll();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //启动线程
        threadA.start();
        threadB.start();
        Thread.sleep(1000);
        threadC.start();

        //等待线程结束
        threadA.join();
        threadB.join();
        threadC.join();

        System.out.println("main over");
    }

}
