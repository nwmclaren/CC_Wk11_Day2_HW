import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public int bookBorrowed(){
        return this.books.size();
    }

    public void addBorrowedBook(Book book) {
        this.books.add(book);
    }


}
