package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private static List<String> history;

    public Calculator() {
        history = new ArrayList<>();
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        setHistoryRecord("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        setHistoryRecord("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        setHistoryRecord("subtracted " + num1 + " from " + num2 + " got " + result);
        return result;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        int result = num1 / num2;
        setHistoryRecord("divided " + num1 + " by " + num2 + " got " + result);
        return result;
    }

    public void setHistoryRecord(String record) {
        this.history.add(record);
    }

    public void printOperations() {
        history.forEach(System.out::println);
    }

    public void clearOperations() {
        history = new ArrayList<>();
    }

    public static List<String> getHistory() {
        return history;
    }
}
