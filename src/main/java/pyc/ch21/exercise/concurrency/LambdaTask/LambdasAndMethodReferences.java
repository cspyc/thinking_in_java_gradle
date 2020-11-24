package pyc.ch21.exercise.concurrency.LambdaTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author pi
 * @date 2020/9/15 19:27:47
 */
class NotRunnable {
    public void go() {
        System.out.println("Not Runnable");
    }
}

class NotCallable {
    public Integer get() {
        System.out.println("Not Callable");
        return 1;
    }
}

public class LambdasAndMethodReferences {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.submit(() -> System.out.println("Lambda1"));
        exec.submit(new NotRunnable()::go);
        exec.submit(new NotCallable()::get);
        exec.submit(() -> {
            System.out.println("Lambda2");
            return 1;
        });
        exec.shutdown();
    }
}
