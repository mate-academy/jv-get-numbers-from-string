package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] digit = text.replaceAll("[^\\d-]", " ").trim().split("\\s+");
        int[] digits = new int[digit.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(digit[i]) * 2;
        }
        return digits;
    }
}
