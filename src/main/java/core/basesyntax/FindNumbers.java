package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] onlyDigitals = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        int[] result = new int[onlyDigitals.length];
        for (int i = 0; i < onlyDigitals.length; i++) {
            result[i] = Integer.parseInt(onlyDigitals[i]) * 2;
        }
        return result;
    }
}
