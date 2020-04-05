package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String str = text.replaceAll("[^0-9]", " ").replaceAll("\\s+"," ");

        int[] result = Arrays.stream(str.split(""))
                .mapToInt(Integer::valueOf)
                .toArray();

        for (int i = 0; i < result.length; i++) {
            result[i] *= result[i];
        }

        return result;
    }
}
