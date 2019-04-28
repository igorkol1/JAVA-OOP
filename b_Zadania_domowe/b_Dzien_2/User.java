package b_Zadania_domowe.b_Dzien_2;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {

    private List<Book> books;

    public User(String firstName, String lastName) {
        super(firstName, lastName);
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void returnBook(Book book) {
        Book bookToReturn = findBook(book);
        if (bookToReturn != null) {
            books.remove(book);
            book.returnBook();
        }
    }

    public void returnAllBooks() {
        books.forEach(Book::returnBook);
        books = new ArrayList<>();
    }

    private Book findBook(Book book) {
        Book[] booksInArray = books.toArray(new Book[]{});
        for (Book item : booksInArray) {
            if (book.equals(item)) {
                return item;
            }
        }
        return null;
    }

}
