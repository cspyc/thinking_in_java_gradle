package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/21 11:42:11
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        //设置为守护线程
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
