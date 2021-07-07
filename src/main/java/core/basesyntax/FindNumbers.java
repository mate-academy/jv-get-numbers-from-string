package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^0-9-]+", " ").trim().split(" ");
        int[] multipliedNumbers = new int[numbers.length];
        int index = 0;
        for (String number : numbers) {
            multipliedNumbers[index++] = 2 * Integer.parseInt(number);
        }
        return multipliedNumbers;
    }
}
