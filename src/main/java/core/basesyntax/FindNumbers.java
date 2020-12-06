package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        return Arrays.stream(text
                .replaceAll("[^0-9 -]+", " ")
                .trim()
                .split("[\\s]+"))
                .mapToInt(s -> Integer.parseInt(s) * 2)
                .toArray();
    }
}
