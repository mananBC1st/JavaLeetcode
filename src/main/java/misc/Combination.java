package misc;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    private final ArrayList<List<Integer>> res = new ArrayList<>();

    private void doSelect(int[] collection, int start, int selectionNumber, List<Integer> container) {
        if (selectionNumber == 0) {
            res.add(new ArrayList<>(container));
            return;
        }
        for (int i = start; i < collection.length; ++i)  {
            container.add(collection[i]);
            doSelect(collection, i + 1, selectionNumber - 1, container);
            // 回溯
            container.remove(container.size() - 1);
        }

    }

    public List<List<Integer>> select(int[] collection, int selectionNumber) {
        doSelect(collection, 0, selectionNumber, new ArrayList<>());
        return res;
    }
}
