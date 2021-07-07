package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] textArr = text.replaceAll("[^0-9\\-]"," ").trim().split("\\s+");
        int[] numArr = new int[textArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(textArr[i]) * 2;
        }
        return numArr;
    }
}
