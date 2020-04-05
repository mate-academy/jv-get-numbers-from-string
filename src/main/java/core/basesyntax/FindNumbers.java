package core.basesyntax;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        String[] results = text.replaceAll("[^\\d\\-]+", " ")
                .trim().split(" ");
        int[] result = new int[results.length];
        for (int i = 0; i < results.length; i++) {
            result[i] = Integer.parseInt(results[i]) * 2;
        }
        return result;
    }
}
