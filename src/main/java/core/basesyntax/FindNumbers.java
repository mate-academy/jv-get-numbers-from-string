package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        String splittedText = text.replaceAll("[^-0-9]", " ").trim();
        String[] numbers = splittedText.split("\\s+");

        int[] result = new int[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(numbers[i]) * 2;
        }
        return result;
    }
}
