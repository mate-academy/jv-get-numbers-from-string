package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^\\d-]+", " ").trim();
        return Arrays.stream(text.split(" "))
                .mapToInt(Integer::valueOf)
                .map(i -> i * 2)
                .toArray();
    }
}
