package pyc.ch21.exercise.concurrency.RunnableTool;

/**
 * @author pi
 * @date 2020/9/15 15:48:13
 */
public class InterferingTask implements Runnable {
    final int id;
    private static Integer val = 0;

    public InterferingTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        //所有的任务都试图写入val的单个实例，并且他们正在踩着彼此的脚趾。我们称这样的类是线程不安全的
        for (int i = 0; i < 100; i++) {
            val++;
        }
        System.out.println(id + " " + Thread.currentThread().getName() + " " + val);
    }
}
