package core.basesyntax;

import java.util.stream.Stream;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String textNums = text.replaceAll("[^-?\\d+$]", " ").trim();
        int [] stringToInt = Stream.of(textNums.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < stringToInt.length; i++) {
            stringToInt[i] *= 2;
        }
        return stringToInt;
    }
}
