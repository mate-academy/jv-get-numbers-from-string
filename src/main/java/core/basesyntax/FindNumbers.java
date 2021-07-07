package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        return Arrays.stream(text.replaceAll("[^\\s\\d-]+", " ")
                .split(" ")).filter(x -> !x.isEmpty())
                .map(x -> Integer.parseInt(x) * 2)
                .mapToInt(x -> x).toArray();
    }
}
