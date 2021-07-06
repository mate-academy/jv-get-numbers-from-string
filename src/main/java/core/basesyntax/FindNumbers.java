package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] ints = text.replaceAll("[^\\d-]+"," ").trim().split(" ");
        int[] resultArray = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            resultArray[i] = Integer.parseInt(ints[i]) * 2;
        }
        return resultArray;
    }
}
