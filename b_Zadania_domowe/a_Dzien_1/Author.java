package b_Zadania_domowe.a_Dzien_1;

import java.util.UUID;

public class Author {

    private UUID id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    public Author(UUID id, String firstName, String lastName, String pseudonym) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }
}
