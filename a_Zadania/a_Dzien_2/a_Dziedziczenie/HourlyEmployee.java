package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(long id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(int hours) {
        return super.getWage() * hours;
    }

}
