package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class SalariedEmployee extends Employee {

    private static final int HOURS_IN_MONTH = 190;

    public SalariedEmployee(long id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment() {
        return super.getWage() * HOURS_IN_MONTH;
    }
}
