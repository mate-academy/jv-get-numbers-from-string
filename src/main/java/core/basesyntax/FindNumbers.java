package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        int[] result = new int[numbers.length];
        for (int i = 0; i != numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]) * 2;
        }
        return result;
    }
}
