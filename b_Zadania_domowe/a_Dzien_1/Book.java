package b_Zadania_domowe.a_Dzien_1;

import java.util.List;
import java.util.UUID;

//Zmodyfikuj klasę Book:
//
//        Dodaj w tej klasie atrybut o nazwie currentUser typu User. Jest to użytkownik, który aktualnie książkę wypożyczył. Dodaj gettery i settery.
//        Zmodyfikuj setter dla atrybutu currentUser tak by:
//        zmieniał wartość atrybutu available na wartość false.
//        na obiekcie currentUser klasy User wywołaj metodę addBook w następujący sposób:
//        currentUser.addBook(this);
//        Zwróć uwagę na klasy Author oraz User - posiadają one takie same atrybuty - przemyśl jak można by rozwiązać ten problem, ale nie wprowadzaj żadnych zmian.

public class Book {

    private UUID id;
    private String title;
    private boolean available = true;
    private String author;
    private List<Author> additionalAuthors;
    private User currentUser;

    public Book(UUID id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(UUID id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(UUID id, String title, String author, List<Author> additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Author> getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setAdditionalAuthors(List<Author> additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        available = false;
        currentUser.addBook(this);
        this.currentUser = currentUser;
    }
}
