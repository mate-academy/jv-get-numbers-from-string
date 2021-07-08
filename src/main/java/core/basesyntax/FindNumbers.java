package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^-?0-9]+", " ").trim().split("(\\s+)");
        int[] result = new int[numbers.length];
        int iterator = 0;
        for (String element : numbers) {
            result[iterator++] = Integer.parseInt(element) * 2;
        }
        return result;
    }
}
