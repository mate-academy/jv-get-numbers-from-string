package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] strArr = text.replaceAll("[^-0-9]+"," ").trim().split(" ");
        int[] arrayNumbers = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arrayNumbers[i] = Integer.parseInt(strArr[i]) * 2;
        }
        return arrayNumbers;
    }
}
