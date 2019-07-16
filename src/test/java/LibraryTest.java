import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library fullLibrary;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void setup(){
        book1 = new Book("Nasty Women", "Various", "Short Stories");
        book2 = new Book("Girl Meets Boy", "Ali Smith", "Fiction");
        book3 = new Book("Brit(ish)", "Afua Hirsch", "Non-Fiction");
        book4 = new Book("Chernobyl: The History of a Nuclear Catastrophe", "Serhii Plokhii", "Non-Fiction");
        book5 = new Book("The Handmaid's Tale", "Margaret Atwood", "Fiction");

        ArrayList<Book> testLibrary = new ArrayList<Book>();
        testLibrary.add(book1);
        testLibrary.add(book2);
        testLibrary.add(book3);
        library = new Library(testLibrary);

        ArrayList<Book> testFullLibrary = new ArrayList<Book>();
        testFullLibrary.add(book1);
        testFullLibrary.add(book2);
        testFullLibrary.add(book3);
        testFullLibrary.add(book4);
        testFullLibrary.add(book5);
        fullLibrary = new Library(testFullLibrary);
    }

    @Test
    public void testNoOfBooksInLibrary(){
        assertEquals(3, library.bookCount());
    }

    @Test
    public void testBookAddedToLibrary(){
        book4 = new Book("Chernobyl: The History of a Nuclear Catastrophe", "Serhii Plokhii", "Non-Fiction");
        library.addBook(book4);
        assertEquals(4, library.bookCount());
    }

    @Test public void testBookNotAddedAsStockFull(){
        book6 = new Book("Natives: Race and Class in the Ruins of Empire", "Akala", "Non-Fiction");
        fullLibrary.addBook(book6);
        assertEquals(5, fullLibrary.bookCount());
    }

}
