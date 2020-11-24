package pyc.functionalprogram;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author pi
 * @date 2020/8/6 09:58:15
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
