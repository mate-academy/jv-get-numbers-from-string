package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] textArray = text.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        int[] allNumbers = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            allNumbers[i] = Integer.parseInt(textArray[i]) * 2;
        }
        return allNumbers;
    }
}
