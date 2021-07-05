package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbersText = text.replaceAll("[^\\-0-9]", "\t")
                .trim().split("\\s+");
        int[] numbers = new int[numbersText.length];
        for (int i = 0; i < numbersText.length; i++) {
            numbers[i] = Integer.parseInt(numbersText[i]) * 2;
        }
        return numbers;
    }
}
