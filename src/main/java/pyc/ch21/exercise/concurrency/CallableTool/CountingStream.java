package pyc.ch21.exercise.concurrency.CallableTool;

import java.util.stream.IntStream;

/**
 * @author pi
 * @date 2020/9/15 18:10:35
 */
public class CountingStream {
    public static void main(String[] args) throws Exception {
        System.out.println(
                IntStream.range(0, 10)
                        .parallel()
                        .mapToObj(CountingTask::new)
                        .map(countingTask -> {
                            try {
                                return countingTask.call();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                        .reduce(0, Integer::sum)
        );
    }
}
