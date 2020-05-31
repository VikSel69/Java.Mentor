package test.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inVar1 = scn.next();                 // ввод первого операнда
        String inOperator = scn.next();             // ввод оператора вычисления
        String inVar2 = scn.next();                 // ввод второго операнда
        int var1 = RomanOperation.getRoman(inVar1); // преобразуем строки в числа
        int var2 = RomanOperation.getRoman(inVar2);
        if (IsNumeric.isNumeric(inVar1) ^ IsNumeric.isNumeric(inVar2)) { // выполняем условие задания 5
            System.out.println("Ошибка!");
        }
        else if (IsNumeric.isNumeric(inVar1)) {     // вычисляем арабские числа
            System.out.println(Operator.calculate(var1, var2, inOperator));
        }
        else System.out.println(RomanOperation.backResult(Operator.calculate(var1, var2, inOperator)));
                                                    // вычисляем римские числа
    }
}
