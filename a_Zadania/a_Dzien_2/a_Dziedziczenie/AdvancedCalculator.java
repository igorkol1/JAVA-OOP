package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

import java.util.List;

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

    public static double computeCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printGlobalOperations() {
        super.printOperations();
    }

    public void printGlobalOperations(int length) {
        List<String> history = getHistory();
        if (history.size() >= length) {
            history.subList(history.size() - length, history.size())
                    .forEach(System.out::println);
        } else {
            throw new IllegalArgumentException("Argument 'lenght' is bigger then history lenght");
        }

    }

    public void printGlobalOperations(String length) {
        int lenghtInInt = 0;
        try {
            lenghtInInt = Integer.parseInt(length);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        printGlobalOperations(lenghtInInt);

    }
}
