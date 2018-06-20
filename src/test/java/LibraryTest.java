import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

Library library;
//Do the individual books are stock or books?
Book book1;
Book book2;
Book book3;

@Before
    public void setup(){
    library = new Library();
    book1 = new Book("Shobogenzo");
    book2 = new Book("Sit Down and Shut Up");
    book3 = new Book("Bleu Comme L'Enfer");
}
@Test
    public void stockIs3(){
    assertEquals(3, library.bookCount());
}
@Test
    public void addBookToLibrary(){
    library.getStock(book4)
    assertEquals(4, library.bookCount());
}
}
