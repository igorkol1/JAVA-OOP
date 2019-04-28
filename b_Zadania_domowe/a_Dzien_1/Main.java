package b_Zadania_domowe.a_Dzien_1;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789);
        account.depositCash(1000);
        account.withdrawCash(500);
        System.out.println(account.printInfo());
        account.withdrawCash(900);
        System.out.println(account.printInfo());
    }
}
