import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        books = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }
}
