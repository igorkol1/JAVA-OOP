package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {

    public int pow(int num1, int num2) {
        int result = (int) Math.pow(num1, num2);
        super.setHistoryRecord(num1 + "^" + num2 + " equals " + result);
        return result;
    }

    public int root(int num1, int num2) {
        int result = (int) Math.pow(Math.E, Math.log(num1) / num2);
        super.setHistoryRecord(num2 + " root of " + num1 + " equals " + result);
        return result;
    }

}
