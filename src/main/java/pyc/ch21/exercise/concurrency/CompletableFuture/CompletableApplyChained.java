package pyc.ch21.exercise.concurrency.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author pi
 * @date 2020/9/16 10:55:06
 */
public class CompletableApplyChained {
    public static void main(String[] args) {
        Long beginTimer = System.currentTimeMillis();

        CompletableFuture<Machina> cf =
                CompletableFuture.completedFuture(new Machina(0))
                        .thenApply(Machina::work)
                        .thenApply(Machina::work)
                        .thenApply(Machina::work)
                        .thenApply(Machina::work);

        Long endTimer = System.currentTimeMillis();

        System.out.println(endTimer - beginTimer);
    }
}

