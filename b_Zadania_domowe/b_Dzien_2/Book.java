package b_Zadania_domowe.b_Dzien_2;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private boolean available = true;
    private Author author;
    private List<Author> additionalAuthors;
    private User currentUser;
    private int popularity = 0;

    public Book(String title) {
        this.id = UUID.randomUUID();
        this.title = title;
    }

    public Book(String title, Author author) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
    }

    public Book(String title, Author author, List<Author> additionalAuthors) {
        this.id = UUID.randomUUID();
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
        popularity++;
        currentUser.addBook(this);
        this.currentUser = currentUser;
    }

    public void returnBook() {
        currentUser = null;
        available = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
