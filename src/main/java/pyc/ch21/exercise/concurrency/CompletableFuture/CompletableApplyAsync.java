package pyc.ch21.exercise.concurrency.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author pi
 * @date 2020/9/16 13:46:55
 */
public class CompletableApplyAsync {
    public static void main(String[] args) {
        Long beginTimer = System.currentTimeMillis();

        CompletableFuture<Machina> cf =
                CompletableFuture.completedFuture(new Machina(0))
                        .thenApplyAsync(Machina::work)
                        .thenApplyAsync(Machina::work)
                        .thenApplyAsync(Machina::work)
                        .thenApplyAsync(Machina::work);

        Long endTimer = System.currentTimeMillis();
        System.out.println(endTimer - beginTimer);

        System.out.println(cf.join());

        Long endTimer2 = System.currentTimeMillis();
        System.out.println(endTimer2 - beginTimer);
    }
}
