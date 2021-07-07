package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        return Arrays.stream(text.replaceAll("[^-0-9]", " ").split(" "))
                .filter(s -> !s.equals(""))
                .mapToInt(Integer::parseInt)
                .map(s -> s * 2)
                .toArray();
    }
}
