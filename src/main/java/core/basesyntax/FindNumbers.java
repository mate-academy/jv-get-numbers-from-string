package core.basesyntax;

import java.util.stream.Stream;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        return Stream.of(text.split("[^-?0-9]+"))
                .filter(string -> !string.isEmpty())
                .mapToInt(Integer::valueOf)
                .map(i -> i * 2)
                .toArray();
    }
}
