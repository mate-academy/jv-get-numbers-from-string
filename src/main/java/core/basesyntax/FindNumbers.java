package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] stringOnlyNum = text.replaceAll("[^\\d\\s-]", " ").trim().split("\\s+");
        int[] intOnlyNum = new int[stringOnlyNum.length];
        for (int i = 0; i < stringOnlyNum.length; i++) {
            intOnlyNum[i] = Integer.parseInt(stringOnlyNum[i]) * 2;
        }
        return intOnlyNum;
    }
}
