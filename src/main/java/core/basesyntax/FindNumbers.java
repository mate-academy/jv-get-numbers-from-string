package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^-?0-9]+", " ");
        String[] strings = text.trim().split(" ");
        int[] result = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            result[i] = Integer.parseInt(strings[i]) * 2;
        }
        return result;
    }
}
