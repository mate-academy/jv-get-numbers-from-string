package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^(-?\\d)]", " ").trim();

        return Arrays.stream(text.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .map(i -> i * 2)
                .toArray();
    }
}
