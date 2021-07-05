package core.basesyntax;

import java.util.stream.Stream;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        return Stream.of(text
                .replaceAll("[^\\-0-9]", "\t")
                .trim()
                .split("\\s+"))
                    .mapToInt(x -> Integer.parseInt(x) * 2)
                    .toArray();
    }
}
