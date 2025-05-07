package p2;
import java.util.ArrayList;
import java.util.Comparator;
// Book.java
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public int getYear() { return year; }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ")";
    }
}

class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void sortByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    public Book getOldest() {
        return books.stream().min(Comparator.comparingInt(Book::getYear)).orElse(null);
    }

    public Book getNewest() {
        return books.stream().max(Comparator.comparingInt(Book::getYear)).orElse(null);
    }

    public void printShelf() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// TestBookShelf.java
class TestBookShelf {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.addBook(new Book("Война и мир", "Л. Толстой", 1869));
        shelf.addBook(new Book("Преступление и наказание", "Ф. Достоевский", 1866));
        shelf.addBook(new Book("Мастер и Маргарита", "М. Булгаков", 1967));

        System.out.println("Самая старая книга: " + shelf.getOldest());
        System.out.println("Самая новая книга: " + shelf.getNewest());

        System.out.println("Книги по возрастанию года:");
        shelf.sortByYear();
        shelf.printShelf();
    }
}
