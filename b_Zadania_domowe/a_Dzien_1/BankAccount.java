package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {

    int number;
    double cash;

    public BankAccount(int number) {
        this.number = number;
        this.cash = 0;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            cash += amount;
        } else {
            throw new IllegalArgumentException("Amount is lower than 0");
        }
    }

    public double withdrawCash(double amount) {
        if (amount > 0) {
            if (cash > amount) {
                cash -= amount;
                return amount;
            } else {
                double temp = cash;
                cash = 0;
                return temp;
            }
        } else {
            throw new IllegalArgumentException("Amount is lower than 0");
        }
    }

    public String printInfo() {
        return number + " " + cash;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

}
