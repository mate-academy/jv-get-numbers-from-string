package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] split = text.replaceAll("[^0-9?-]+", " ").trim().split(" ");
        List<Integer> allInt = new ArrayList<>();
        for (String s : split) {
            allInt.add(Integer.parseInt(s) * 2);
        }
        return allInt.stream().mapToInt(j -> j).toArray();
    }
}
