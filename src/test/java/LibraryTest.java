import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setup(){
    library = new Library(2);
    book1 = new Book("2001", "Arthur C Clarke","Sci-Fi");
    book2 = new Book("Gone Girl","Gilliam Flynn", "Thriller");
    book3 = new Book("Romeo & Juliet","William Shakespeare", "Romance");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        assertEquals(0, library.bookCount());
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canNotAddBookWhenFull(){
        assertEquals(0, library.bookCount());
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2,library.bookCount());
        library.addBook(book3);
        assertEquals(2,library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        assertEquals(0, library.bookCount());
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2,library.bookCount());
        library.removeBook();
        assertEquals(1,library.bookCount());

    }


}
