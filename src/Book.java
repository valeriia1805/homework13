import java.util.Objects;

public class Book {
    private final String book;
    private final Author author;
    private int year;

    public Book(String book, int year, Author author) {
        this.book = book;
        this.year = year;
        this.author = author;
    }

    public String getBook() {
        return this.book;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author.getName() + " " + this.author.getLastName();
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author == book.author && Objects.equals(book, book.book) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, author, year);
    }

    @Override
    public String toString() {
        return author.toString();
    }
}