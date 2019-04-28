package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Main1 {

    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.multiply(1, 2);
        advancedCalculator.divide(4, 2);
        advancedCalculator.pow(2, 4);
        advancedCalculator.root(2, 4);
        advancedCalculator.printOperations();
    }
}
