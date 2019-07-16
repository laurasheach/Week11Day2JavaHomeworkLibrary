import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        book1 = new Book("Nasty Women", "Various", "Short Stories");
        book2 = new Book("Girl Meets Boy", "Ali Smith", "Fiction");
        book3 = new Book("Brit(ish)", "Afua Hirsch", "Non-Fiction");

        ArrayList<Book> testBorrowings = new ArrayList<Book>();
        testBorrowings.add(book1);
        borrower = new Borrower("Laura", testBorrowings);

        ArrayList<Book> testLibrary = new ArrayList<Book>();
        testLibrary.add(book1);
        testLibrary.add(book2);
        testLibrary.add(book3);
        library = new Library(testLibrary);

    }

    @Test
    public void borrowingsStartNumber(){
        assertEquals(1, borrower.borrowedCount());
    }

    @Test
    public void canBorrowABook(){
        borrower.borrowBook(library);
        assertEquals(2, borrower.borrowedCount());
        assertEquals(2, library.bookCount());
    }

}
