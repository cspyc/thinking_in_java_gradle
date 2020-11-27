package pyc.exercise.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pi
 * @date 20/11/26 11:29:49
 */
public class GoSet {
    private Set<Long> ids = new HashSet<>();

    public void addId(Long l) {
        ids.add(l);
    }

    public Set<Long> getIds() {
        return ids;
    }

    public GoSet() {
    }

    public boolean isPresentTemplateIdInExistedTemplateIds(Long l) {
        if (this.ids.contains(l)) {
            return true;
        }
        return false;
    }
}
