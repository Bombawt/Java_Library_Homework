import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Darwin's Children", "Greg Bear", "Science Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Darwin's Children", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Greg Bear", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Science Fiction", book.getGenre());
    }
}
