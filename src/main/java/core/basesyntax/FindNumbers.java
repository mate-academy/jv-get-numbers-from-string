package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] strArr = text.replaceAll("[^\\d-]+", " ").trim().split(" ");
        int[] res = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Integer.parseInt(strArr[i]) * 2;
        }
        return res;
    }
}
