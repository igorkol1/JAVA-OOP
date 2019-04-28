package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private double wage;

    public Employee(long id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public void raiseWage(int percent) {
        if (percent >= 0) {
            wage = wage * ((double) (percent / 100) + 1);
        } else {
            throw new IllegalArgumentException("Argument 'percent' is less than 0");
        }
    }

    public double getWage() {
        return wage;
    }
}
