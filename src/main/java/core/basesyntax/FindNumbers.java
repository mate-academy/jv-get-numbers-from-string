package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] onlyNumbers = text.replaceAll("[^0-9\\-]", " ").trim().split(" +");
        int[] result = new int[onlyNumbers.length];
        int i = 0;
        for (String number : onlyNumbers) {
            result[i] = Integer.parseInt(number) * 2;
            i++;
        }
        return result;
    }
}
