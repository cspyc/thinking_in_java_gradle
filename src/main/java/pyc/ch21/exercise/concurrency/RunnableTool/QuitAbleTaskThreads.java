package pyc.ch21.exercise.concurrency.RunnableTool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/16 09:38:35
 */
public class QuitAbleTaskThreads {
    public static final int COUNT = 150;

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        List<QuitAbleTask> tasks = IntStream.range(1, COUNT)
                .mapToObj(QuitAbleTask::new)
                .peek(qt -> exec.execute(qt))
                .collect(Collectors.toList());

        new Nap(1);

        System.out.println("Begin quit tasks......");
        tasks.forEach(QuitAbleTask::quit);

        exec.shutdown();
    }
}
