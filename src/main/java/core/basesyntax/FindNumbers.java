package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] words = text.replaceAll(("[^0-9\\-]"), " ")
                .trim()
                .split("\\s+");
        int[] digits = new int [words.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(words[i]) * 2;
        }
        return digits;
    }
}
