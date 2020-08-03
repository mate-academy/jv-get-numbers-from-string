package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        String[] textArray = text.replaceAll("[^0-9-]"," ").trim().split("\\s+");
        int[] numArray = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            numArray[i] = Integer.parseInt(textArray[i]) * 2;
        }
        return numArray;
    }
}
