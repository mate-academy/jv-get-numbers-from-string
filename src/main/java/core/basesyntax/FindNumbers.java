package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^0-9\\-]+", " ");
        String[] stringOfNumbers = text.trim().split(" ");
        int[] arraysOfNumbers = new int[stringOfNumbers.length];
        for (int i = 0; i < stringOfNumbers.length; i++) {
            arraysOfNumbers[i] = Integer.parseInt(stringOfNumbers[i]) * 2;
        }
        return arraysOfNumbers;
    }
}
