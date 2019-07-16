import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowings;

    public Borrower(String name, ArrayList<Book> borrowings){
        this.name = name;
        this.borrowings = borrowings;
    }

    public int borrowedCount(){
        return this.borrowings.size();
    }

    public void borrowBook(Library library){
        Book bookBorrowed = library.loanBook();
        this.borrowings.add(bookBorrowed);
    }
}
