package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Main1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        calculator.subtract(1,1);
        calculator.multiply(1,2);
        calculator.divide(4,2);
        calculator.printOperations();
        calculator.clearOperations();
        System.out.println("After clean: ");
        calculator.printOperations();
    }
}
