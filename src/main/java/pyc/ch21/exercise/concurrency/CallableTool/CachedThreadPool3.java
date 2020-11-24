package pyc.ch21.exercise.concurrency.CallableTool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/15 16:28:39
 */
public class CachedThreadPool3 {
    public static Integer extractResult(Future<Integer> f) {
        try {
            return f.get();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        //创建任务列表
        List<CountingTask> tasks = IntStream.range(0, 10)
                .mapToObj(CountingTask::new)
                .collect(Collectors.toList());

        //cachedThreadPool 线程池执行任务，返回结果 Future是Java 5中引入的机制，允许你提交任务而无需等待它完成
        List<Future<Integer>> futures = exec.invokeAll(tasks);
        Integer sum = futures.stream()
                .map(CachedThreadPool3::extractResult)
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);
        exec.shutdown();
    }
}
