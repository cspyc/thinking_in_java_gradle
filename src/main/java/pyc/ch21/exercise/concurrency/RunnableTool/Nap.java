package pyc.ch21.exercise.concurrency.RunnableTool;

import java.util.concurrent.TimeUnit;

/**
 * @author pi
 * @date 2020/9/14 17:51:25
 */
public class Nap {
    public Nap(double t) {
        try {
            TimeUnit.MILLISECONDS.sleep((int) (1000 * t));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Nap(double t,String msg){
        this(t);
        System.out.println(msg);
    }
}
