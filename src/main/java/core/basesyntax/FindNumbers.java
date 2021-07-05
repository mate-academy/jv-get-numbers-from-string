package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] justDigitsStr = text.replaceAll("[^0-9\\-]"," ")
                .replaceAll("\\s+"," ").trim().split(" ");
        int[] justDigits = new int[justDigitsStr.length];
        for (int i = 0; i < justDigitsStr.length; i++) {
            justDigits[i] = Integer.parseInt(justDigitsStr[i]) * 2;
        }
        return justDigits;
    }
}
