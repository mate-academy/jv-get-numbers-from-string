package core.basesyntax;

import java.util.stream.Stream;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String textNums = text.replaceAll("[^-?\\d+$]", " ").trim();
        return Stream.of(textNums.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .map(number -> number * 2)
                .toArray();
    }
}
