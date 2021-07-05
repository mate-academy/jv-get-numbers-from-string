package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] tempArray = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        int[] resultArray = new int[tempArray.length];

        for (int i = 0; i < tempArray.length; i++) {
            resultArray[i] = Integer.parseInt(tempArray[i]) * 2;
        }

        return resultArray;
    }
}
