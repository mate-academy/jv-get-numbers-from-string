package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] strings = text
                .replaceAll("[^(-?\\d)]+", " ")
                .trim()
                .split(" ");
        int[] numbers = new int[strings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]) * 2;
        }
        return numbers;
    }
}
