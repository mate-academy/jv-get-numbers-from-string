package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] tableString = (text.replaceAll("[^-?\\d]+", " ").trim().split(" "));
        int[] tableInt = new int[tableString.length];
        for (int i = 0; i < tableInt.length; i++) {
            tableInt[i] = Integer.parseInt(tableString[i]) * 2;
        }
        return tableInt;
    }
}
