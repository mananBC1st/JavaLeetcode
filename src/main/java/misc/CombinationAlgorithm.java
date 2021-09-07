package misc;

import java.util.ArrayList;
import java.util.List;

public final class CombinationAlgorithm<ElementType> {

    private final List<List<ElementType>> res = new ArrayList<>();

    private void doSelect(List<ElementType> collection, int start, int selectionNumber, List<ElementType> container) {
        if (selectionNumber == 0) {
            res.add(new ArrayList<>(container));
            return;
        }

        for (int i = start, len = collection.size(); i < len; ++i) {
            container.add(collection.get(i));
            doSelect(collection, i + 1, selectionNumber - 1, container);
            // 回溯
            container.remove(container.size() - 1);
        }
    }

    public List<List<ElementType>> select(List<ElementType> collection, int selectionNumber) {
        doSelect(collection, 0, selectionNumber, new ArrayList<>());
        return res;
    }

}
