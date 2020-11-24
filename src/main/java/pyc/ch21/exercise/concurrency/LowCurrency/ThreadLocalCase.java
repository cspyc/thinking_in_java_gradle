package pyc.ch21.exercise.concurrency.LowCurrency;

/**
 * @author pi
 * @date 2020/9/22 11:37:46
 */
public class ThreadLocalCase {
    //创建ThreadLocal变量
    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    //print函数
    static void print (String str){
        //1.1打印当前线程本地内在中localVariable变量的值
        System.out.println(str + ":" + localVariable.get());
        localVariable.remove();
    }

    public static void main(String[] args) {
        //创建线程one
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程One中本地变量localVariable的值
                localVariable.set("threadOne local variable");

                //调用打印函数
                print("threadOne");

                //打印本地变量值
                System.out.println("threadOne remove after" + ":" + localVariable.get());
            }
        });

        //创建线程two
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程two中本地变量localVariable的值
                localVariable.set("threadTwo local variable");

                //调用打印函数
                print("threadTwo");

                //打印本地变量值
                System.out.println("threadTwo remove after" + ":" + localVariable.get());
            }
        });
        //启动线程
        threadOne.start();
        threadTwo.start();
    }
}
