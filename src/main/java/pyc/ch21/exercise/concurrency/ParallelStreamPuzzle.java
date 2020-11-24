package pyc.ch21.exercise.concurrency;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author pi
 * @date 2020/9/14 15:55:07
 */
public class ParallelStreamPuzzle {
    static class IntGenerator implements Supplier<Integer> {
        private int current = 0;

        public Integer get() {
            return current++;
        }
    }


    //一堆线程都在从一个生成器取值，然后以某种方式选择有限的结果集？代码看起来很简单，但它变成了一个特别棘手的问题。
    public static void main(String[] args) {
        List<Integer> x = Stream.generate(new IntGenerator())
                .limit(10)
                .parallel()
                .collect(Collectors.toList());
        System.out.println(x);
    }
}
