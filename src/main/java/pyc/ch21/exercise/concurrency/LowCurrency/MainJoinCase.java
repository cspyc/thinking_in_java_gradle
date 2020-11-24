package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/17 11:23:56
 */
public class MainJoinCase {
    public static void main(String[] args) throws Exception {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("child threadA over!");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("child threadB over");
            }
        });

        //启动子线程
        threadA.start();
        threadB.start();
        System.out.println("wait all child thread over!");

        //等待子线程执行完毕，返回
        threadA.join();
        threadB.join();
        System.out.println("all child thread over!");
    }
}
