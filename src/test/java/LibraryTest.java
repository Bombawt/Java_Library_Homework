import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        book = new Book("Darwin's Children", "Greg Bear", "Science Fiction");
        library = new Library();
    }

    @Test
    public void checkLibraryContents(){
        assertEquals(0, library.contents());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.contents());
    }

    @Test
    public void removeBookFromLibrary(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.contents());
    }

    @Test
    public void checkLibraryCapacityCannotBeExceeded(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.contents());
    }

}