import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(ArrayList<Book> books){
        this.books = books;
        this.capacity = 5;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book loanBook(){
        return this.books.remove(0);
    }

}
