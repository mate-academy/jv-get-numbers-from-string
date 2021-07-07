package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^0-9-]", " ").trim().split("\\s+");
        int[] arrayNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arrayNumbers[i] = Integer.parseInt(numbers[i]) * 2;
        }
        return arrayNumbers;
    }
}
