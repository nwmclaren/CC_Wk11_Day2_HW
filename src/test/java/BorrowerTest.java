import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Borrower borrower;
    Book book1;
    Book book2;

    @Before
    public void setup(){
        library = new Library(2);
        borrower = new Borrower("Jimmy Bloggs");
        book1 = new Book("1984","George Orwell","Drama");
    }

    @Test
    public void bookBorrowedCount(){
        assertEquals(0,borrower.bookBorrowed());
    }

    @Test
    public void canAddBorrowedBook(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.addBorrowedBook(book1);
        assertEquals(1, borrower.bookBorrowed());
        library.removeBook();
        assertEquals(1, library.bookCount());
    }


}
