package pyc.ch21.exercise.concurrency;

import java.util.function.LongSupplier;
import java.util.stream.LongStream;

/**
 * @author pi
 * @date 2020/9/14 14:17:44
 */
public class Summing {
    static void timeTest(String id, long checkValue, LongSupplier operation) {
        System.out.println(id + ": ");
        long beginTime = System.currentTimeMillis();
        long result = operation.getAsLong();
        if (result == checkValue) {
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - beginTime + " ms");
        } else {
            System.out.format("result: %d%n checkValue: %d%n", result, checkValue);
        }
    }

    public static final int SZ = 1_00_000_000;
    public static final long CHECK = (long) SZ * ((long) SZ + 1) / 2;

    public static void main(String[] args) {
        System.out.println(CHECK);

        timeTest("Sum Stream", CHECK,
                () -> LongStream.rangeClosed(0, SZ).sum());

        timeTest("Sum Stream Parallel", CHECK,
                () -> LongStream.rangeClosed(0, SZ).parallel().sum());

        timeTest("Sum Iterated", CHECK,
                () -> LongStream.iterate(0, i -> i + 1).limit(SZ + 1).sum());
    }
}
