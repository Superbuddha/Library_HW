import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void setup(){
        book = new Book("Shobogenzo");
    }
    @Test public void bookHasTitle(){
        assertEquals(book.getTitle(), "Shobogenzo");
    }
}
