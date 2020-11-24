package pyc.ch21.exercise.concurrency.RunnableTool;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author pi
 * @date 2020/9/16 09:27:12
 */
public class QuitAbleTask implements Runnable {
    final int id;

    public QuitAbleTask(int id) {
        this.id = id;
    }

    private AtomicBoolean runningFlag = new AtomicBoolean(true);

    //虽然多个任务（线程？）可以在同一个实例上成功调用quit()，
    // 但是AtomicBoolean可以防止多个任务同时实际修改runningFlag，
    // 从而使quit()方法成为线程安全的。
    public void quit() {
        runningFlag.set(false);
    }

    @Override
    public void run() {
        while (runningFlag.get()) {
            new Nap(0.00001);
        }
        System.out.println(id + ":" + Thread.currentThread().getName() + " " );
    }
}
