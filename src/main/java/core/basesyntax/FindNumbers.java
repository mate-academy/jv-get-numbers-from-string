package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] textResult = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        int[] numbers = new int[textResult.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(textResult[i]) * 2;
        }
        return numbers;
    }
}
