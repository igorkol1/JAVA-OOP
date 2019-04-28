package b_Zadania_domowe.b_Dzien_2;

public class Author extends Person {

    private String pseudonym;

    public Author(String firstName, String lastName, String pseudonym) {
        super(firstName, lastName);
        this.pseudonym = pseudonym;
    }
}
