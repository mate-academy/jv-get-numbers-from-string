package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] digitFromText = text.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        int[] arrayDigitFromString = new int[digitFromText.length];
        for (int i = 0; i < digitFromText.length; i++) {
            arrayDigitFromString[i] = Integer.parseInt(digitFromText[i]) * 2;
        }
        return arrayDigitFromString;
    }
}
