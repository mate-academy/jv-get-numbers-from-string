package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] string = text.replaceAll("[^-0-9]", " ").trim().split("\\s+");
        int[] numbers = new int[string.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(string[i]) * 2;
        }
        return numbers;
    }
}
