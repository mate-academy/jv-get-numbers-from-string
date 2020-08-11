package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] allNumbers = text.replaceAll("[^-?\\d]+", " ").trim().split(" ");
        int[] allNumbersIntArray = new int[allNumbers.length];
        for (int i = 0; i < allNumbersIntArray.length; i++) {
            allNumbersIntArray[i] = 2 * Integer.parseInt(allNumbers[i]);
        }
        return allNumbersIntArray;
    }
}
