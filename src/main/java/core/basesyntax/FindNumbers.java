package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] arrayWords = text.replaceAll("[^0-9\\-]", " ").split("[^0-9\\-]");
        return Arrays.stream(arrayWords)
                .filter(x -> x.length() > 0)
                .mapToInt(s -> (Integer.parseInt(s) * 2))
                .toArray();
    }
}

