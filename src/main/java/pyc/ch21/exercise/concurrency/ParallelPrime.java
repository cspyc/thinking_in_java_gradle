package pyc.ch21.exercise.concurrency;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.LongStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

/**
 * @author pi
 * @date 2020/9/14 11:02:05
 */
public class ParallelPrime {
    static final int COUNT = 100_000;

    public static boolean isPrime(long n) {
        return rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) throws IOException {
        long beginTime = System.currentTimeMillis();

        List<String> primes =
                iterate(2,i->i+1)
                .parallel()
                .filter(ParallelPrime::isPrime)
                .limit(COUNT)
                .mapToObj(Long::toString)
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - beginTime);
        Files.write(Paths.get("primes.txt"),primes, StandardOpenOption.CREATE);

    }
}
