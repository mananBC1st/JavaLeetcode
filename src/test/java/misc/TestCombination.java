package misc;

import java.util.List;

public class TestCombination {

    public static void main(String... args) {
        int[] collection = new int[] {1, 2, 3, 4, 5};
        var res = new Combination().select(collection, 2);
        res.forEach(System.out::println);
        System.out.println("------------------------------");
        var r = new CombinationAlgorithm<Integer>().select(List.of(1,2,3,4,5), 2);
        r.forEach(System.out::println);
    }
}
