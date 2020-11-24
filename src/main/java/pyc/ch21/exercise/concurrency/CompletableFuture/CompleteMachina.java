package pyc.ch21.exercise.concurrency.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author pi
 * @date 2020/9/16 10:36:52
 */
public class CompleteMachina {
    public static void main(String[] args) {
        CompletableFuture<Machina> cf =
                CompletableFuture.completedFuture(new Machina(0));

        try {
            //get() 在等待结果时阻塞调用线程
            Machina m = cf.get();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
