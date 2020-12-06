package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] onlyNumbers = text.replaceAll("[^0-9\\-]"," ")
                .replaceAll("\\s+"," ").trim().split(" ");
        return Arrays.stream(onlyNumbers).mapToInt(x -> Integer.parseInt(x) * 2).toArray();
    }
}
