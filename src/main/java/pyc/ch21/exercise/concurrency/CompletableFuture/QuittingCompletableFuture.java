package pyc.ch21.exercise.concurrency.CompletableFuture;

import cn.pyc.ch21.exercise.concurrency.RunnableTool.Nap;
import cn.pyc.ch21.exercise.concurrency.RunnableTool.QuitAbleTask;
import cn.pyc.ch21.exercise.concurrency.RunnableTool.QuitAbleTaskThreads;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/16 10:19:27
 */
public class QuittingCompletableFuture {
    public static void main(String[] args) {

        //任务是一个 List<QuitAbleTask>，就像在 QuittingTasks.java 中一样，
        // 但是在这个例子中，没有 peek() 将每个 QuitAbleTask 提交给 ExecutorService。
        // 相反，在创建 cfutures 期间，每个任务都交给 CompletableFuture::runAsync。
        // 这执行 VerifyTask.run() 并返回 CompletableFuture<Void> 。
        // 因为 run() 不返回任何内容，所以在这种情况下我只使用 CompletableFuture 调用 join() 来等待它完成。
        List<QuitAbleTask> tasks = IntStream.range(1, QuitAbleTaskThreads.COUNT)
                .mapToObj(QuitAbleTask::new)
                .collect(Collectors.toList());

        List<CompletableFuture<Void>> completableFutures = tasks.stream()
                .map(CompletableFuture::runAsync)
                .collect(Collectors.toList());

        new Nap(1);

        tasks.forEach(QuitAbleTask::quit);

        completableFutures.forEach(CompletableFuture::join);
    }
}
