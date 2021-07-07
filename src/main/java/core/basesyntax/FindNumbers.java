package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        String[] ints = text.replaceAll("[^\\d-]+"," ").trim().split(" ");
        int[] needArray = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            needArray[i] = Integer.parseInt(ints[i]) * 2;
        }
        return needArray;
    }
}
