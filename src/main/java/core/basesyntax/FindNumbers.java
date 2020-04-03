package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String a = "";

        for (int i = 0; i < text.length() - 1; i++) {
            if (Character.isDigit(text.charAt(i)) || (text.charAt(i) == '-')) {
                a = a + text.charAt(i);
                if (!Character.isDigit(text.charAt(i + 1))) {
                    a = a + " ";
                }
            }
        }
        if ((Character.isDigit(text.charAt(text.length() - 1)))) {
            a = a + text.charAt(text.length() - 1);
        }
        String[] mass = a.split(" ");
        int[] result = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            result[i] = Integer.parseInt(mass[i]) * 2;
        }
        return result;
    }
}
