package pyc.ch21.exercise.concurrency.RunnableTool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/14 17:54:17
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();

        IntStream.range(0, 10)
                .mapToObj(NapTask::new)
                .forEach(exec::execute);
        System.out.println("All tasks submitted");

        exec.shutdown();

        while (!exec.isTerminated()) {
            System.out.println(
                    Thread.currentThread().getName() + " awaiting termination");
            new Nap(0.1);
        }
    }
}
