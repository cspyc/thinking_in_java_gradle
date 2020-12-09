package pyc.exercise.collections;

import java.util.ArrayList;
import java.util.List;


/**
 * @author pi
 * @date 20/12/7 14:23:08
 */
public class ListUtil {
    public <T> List<List<T>> splitList(List<T> list, int groupSize) {
        int length = list.size();
        // 计算可以分成多少组
        int groupCount = (length + groupSize - 1) / groupSize;
        List<List<T>> newList = new ArrayList<>(groupCount);
        for (int i = 0; i < groupCount; i++) {
            // 开始位置
            int fromIndex = i * groupSize;
            // 结束位置
            int toIndex = Math.min((i + 1) * groupSize, length);
            newList.add(list.subList(fromIndex, toIndex));
        }
        return newList;
    }
}
