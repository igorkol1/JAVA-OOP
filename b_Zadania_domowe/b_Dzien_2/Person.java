package b_Zadania_domowe.b_Dzien_2;

import java.util.UUID;

public class Person {

    private UUID id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
