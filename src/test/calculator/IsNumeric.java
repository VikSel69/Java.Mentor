package test.calculator;

public class IsNumeric {
    public static boolean isNumeric (String str) { // определяем есть ли числа в строке
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
