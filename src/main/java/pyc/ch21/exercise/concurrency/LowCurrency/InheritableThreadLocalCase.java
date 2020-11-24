package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/22 13:40:04
 */
public class InheritableThreadLocalCase {
    //创建ThreadLocal变量
    static ThreadLocal<String> localVariable = new InheritableThreadLocal<String>();

    public static void main(String[] args) {
        //设置线程变量
        localVariable.set("hello world");

        //启动子线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //子线程输出线程变量的值
                System.out.println("thread:" + localVariable.get());
            }
        });

        thread.start();

        //主线程输出线程变量的值
        System.out.println("main:" + localVariable.get());
    }
}
