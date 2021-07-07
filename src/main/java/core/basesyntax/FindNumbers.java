package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] number = text.replaceAll("[^-?0-9]+", " ").strip().split(" ");
        return Arrays.stream(number).mapToInt(i -> Integer.parseInt(i) * 2).toArray();
    }
}
