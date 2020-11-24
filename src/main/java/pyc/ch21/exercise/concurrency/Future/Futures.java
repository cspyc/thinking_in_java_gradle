package pyc.ch21.exercise.concurrency.Future;

import pyc.ch21.exercise.concurrency.CallableTool.CountingTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author pi
 * @date 2020/9/15 17:24:26
 */
public class Futures {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> f = exec.submit(new CountingTask(99));
        System.out.println(f.get());
        exec.shutdown();
    }
}
