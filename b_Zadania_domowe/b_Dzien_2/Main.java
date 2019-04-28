package b_Zadania_domowe.b_Dzien_2;

public class Main {

    public static void main(String[] args) {
        Author orwell = new Author("Groge", "Orwell", "Orwell");
        User igor = new User("Igor", "Kołodziejczyk");
        Book book = new Book("Animal Farm", orwell);
        SoundBook soundBook = new SoundBook("1984", orwell, 69.45, 3);

        book.setCurrentUser(igor);
        soundBook.setCurrentUser(igor);

        igor.returnBook(soundBook);
        igor.returnAllBooks();
    }
}
