package pyc.ch21.exercise.concurrency.RunnableTool;

/**
 * @author pi
 * @date 2020/9/14 17:48:39
 */
public class NapTask implements Runnable {
    final int id;

    public NapTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        new Nap(0.1);
        System.out.println(this + "  " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return "NapTask[" + id + "]";
    }
}
