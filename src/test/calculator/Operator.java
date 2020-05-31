package test.calculator;

public class Operator {

    public static int calculate (int var1, int var2, String operator) { // производим вычисления по введенному оператору
        int result = 0;
        switch (operator) {
            case "+": result = var1 + var2; break;
            case "-": result = var1 - var2; break;
            case "*": result = var1 * var2; break;
            case "/": result = var1 / var2; break;
        }
        return result;
    }
}
