package pyc.ch21.exercise.concurrency.RunnableTool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/15 15:52:28
 */
public class CachedThreadPool2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        IntStream.range(0, 10)
                .mapToObj(InterferingTask::new)
                .forEach(exec::execute);
        exec.shutdown();

    }
}
