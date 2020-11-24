package pyc.ch21.exercise.concurrency.CallableTool;

import java.util.concurrent.Callable;

/**
 * @author pi
 * @date 2020/9/15 16:16:10
 */
public class CountingTask implements Callable<Integer> {
    final int id;

    public CountingTask(int id) {
        this.id = id;
    }

    @Override
    public Integer call() throws Exception {
        Integer val = 0;
        for (int i = 0; i < 100; i++) {
            val++;
        }
        System.out.println(id + " " + Thread.currentThread().getName() + " " + val);
        return val;
    }
}
