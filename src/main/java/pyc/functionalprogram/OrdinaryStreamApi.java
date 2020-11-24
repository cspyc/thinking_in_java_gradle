package pyc.functionalprogram;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author pi
 * @date 2020/8/7 15:27:51
 */
public class OrdinaryStreamApi {
    public List<Integer> filterAllEvenNumber(Integer[] integers) {
        return Arrays.asList(integers)
                .stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer> calculateWordsLength(String[] words) {
        return Arrays.asList(words)
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public List<String> mergeWordsCharactersDistinctly(String[] words) {
        return Arrays.asList(words)
                .stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer[]> combineArrayAElementsAndArrayBElementsForNewArrays(Integer[] arrayA, Integer[] arrayB) {
        return Arrays.asList(arrayA)
                .stream()
                .flatMap(i -> Arrays.asList(arrayB).stream().map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
    }

    public List<Integer[]> combineArrayAElementsAndArrayBElementsForNewArraysSumCanDividedBy3(Integer[] arrayA, Integer[] arrayB) {
        return Arrays.asList(arrayA)
                .stream()
                .flatMap(i -> Arrays.asList(arrayB).stream().filter(j -> (i + j) % 3 == 0).map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
    }

    public Integer calculateMaxNumber(Integer[] numbers) {
        Optional<Integer> maxNumberObj =
                Arrays.asList(numbers)
                        .stream()
                        .reduce(Integer::max);
        return maxNumberObj.get();
    }

    public List<String> switchStringToUppercase(String[] stringArray) {
        Stream<String> stringStream = Stream.of(stringArray);
        return stringStream.map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public long countUniqueWordInFile(Path dataFile) {
        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(dataFile, Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return uniqueWords;
    }

    public List<Integer> generateIntegerNumberByStreamIterate(int numberCount, int beginNumber) {
        return Stream.iterate(beginNumber, n -> n + 1)
                .limit(numberCount)
                .collect(Collectors.toList());
    }

    public List<int[]> generateFibonacciElements(int elementCount) {
        return Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]})
                .limit(elementCount)
                .collect(Collectors.toList());
    }


    public List<Double> generateRandomNumber() {
        return Stream.generate(Math::random)
                .limit(5)
                .collect(Collectors.toList());
    }

    public long calculateSumOfNumbers(int numberCount) {
        long start = System.currentTimeMillis();

        long num = LongStream.rangeClosed(1,numberCount)
                .parallel()
                .reduce(0L,Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(end-start + "ms");
        return num;
    }
}
