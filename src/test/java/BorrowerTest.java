import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book1;
    private Book book2;
    private Borrower borrower;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Chadd");
        book1 = new Book("Darwin's Children", "Greg Bear", "Science Fiction");
        book2 = new Book("Spellmonger", "Terry Mancour", "Fantasy");
        library = new Library();
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void checkCollection(){
        assertEquals(0, borrower.checkCollection());
    }

    @Test
    public void borrowBookFromLibrary(){
        borrower.borrowBook(library);
        assertEquals(1, library.contents());
        assertEquals(1, borrower.checkCollection());
    }
}
