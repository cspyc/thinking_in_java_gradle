package pyc.ch21.exercise.concurrency.CallableTool;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author pi
 * @date 2020/9/16 15:21:08
 */
public class CallerTask implements Callable {
    @Override
    public Object call() throws Exception {
        return "hello world!Give me your gifts";
    }

    public static void main(String[] args) {
        //创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());

        //启动线程
        new Thread(futureTask).start();

        try {
            //等待任务执行完毕，返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
