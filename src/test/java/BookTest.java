import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("Carol", "Patricia Highsmith", "Drama");
    }

    @Test
    public void canGetBookTitle(){
        assertEquals("Carol", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Patricia Highsmith", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Drama", book.getGenre());
    }

}
