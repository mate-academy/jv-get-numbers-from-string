package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] splitText = text.replaceAll("[^\\d-]+", " ").trim().split("[\\s]+");
        int[] allNumbers = new int[splitText.length];
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = Integer.valueOf(splitText[i]) * 2;
        }
        return allNumbers;
    }
}
