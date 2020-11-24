package pyc.ch21.exercise.concurrency.RunnableTool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/15 15:43:23
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        //当你运行这个程序时，你会发现它完成得更快。
        // 这是有道理的，每个任务都有自己的线程，所以它们都并行运行，而不是使用相同的线程来顺序运行每个任务。
        ExecutorService exec = Executors.newCachedThreadPool();
        IntStream.range(0,10)
                .mapToObj(NapTask::new)
                .forEach(exec::execute);

        exec.shutdown();
    }
}
