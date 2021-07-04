package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] startArray = text.replaceAll("[^0-9\\-]", " ")
                .replaceAll("\\s+", " ")
                .trim().split(" ");
        int[] finalArray = new int[startArray.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = Integer.parseInt(startArray[i]) * 2;
        }
        return finalArray;
    }
}
