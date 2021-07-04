package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        String[] onlyDigits = text.replaceAll("[^0-9\\-]+", " ").trim().split("\\s+");

        int[] results = new int[onlyDigits.length];

        for (int i = 0; i < onlyDigits.length; i++) {
            results[i] = Integer.parseInt(onlyDigits[i]) * 2;
        }
        return results;
    }
}
