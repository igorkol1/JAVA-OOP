package b_Zadania_domowe.a_Dzien_1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private UUID id;
    private String firstName;
    private String lastName;
    private List<Book> books;

    public User(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

}
