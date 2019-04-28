package b_Zadania_domowe.b_Dzien_2;

import java.util.List;

public class SoundBook extends Book {

    private double duration;
    private int numberOfCarriers;

    public SoundBook(String title, double duration, int numberOfCarriers) {
        super(title);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public SoundBook(String title, Author author, double duration, int numberOfCarriers) {
        super(title, author);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public SoundBook(String title, Author author, List<Author> additionalAuthors, double duration, int numberOfCarriers) {
        super(title, author, additionalAuthors);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }
}
