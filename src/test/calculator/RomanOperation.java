package test.calculator;

public class RomanOperation {               // переводим строчные значения в числа

    public static int getRoman (String var) {
        int result;
        switch (var) {
            case "I": result = 1; break;
            case "II": result = 2; break;
            case "III": result = 3; break;
            case "IV": result = 4; break;
            case "V": result = 5; break;
            case "VI": result = 6; break;
            case "VII": result = 7; break;
            case "VIII": result = 8; break;
            case "IX": result = 9; break;
            case "X": result = 10; break;
            default: result = Integer.parseInt(var);
        }
        return result;
    }
    public static String backResult (int num) { // переводим арабские числа в римские
        String[] romanArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI,", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        return romanArray[num - 1];
    }
}
