package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] splitData = text.replaceAll("[^ \\d-]", " ")
                .replaceAll(" +", " ").trim().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String line : splitData) {
            list.add(Integer.parseInt(line) * 2);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
