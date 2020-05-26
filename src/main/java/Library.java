import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryStock;
    private int capacity;

    public Library() {
        this.libraryStock = new ArrayList<Book>();
        this.capacity = 5;

    }

    public int contents() {
        return this.libraryStock.size();
    }

    public void addBook(Book book) {
        if (this.libraryStock.size() < this.capacity) {
            this.libraryStock.add(book);
        }
    }

    public Book removeBook() {
        return this.libraryStock.remove(0);
    }
}
