package bookAssertions;

import books.Book;
import books.LibraryCatalog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTests {

    @Test
    public void test_books(){
        Book b1 = new Book("Ambedkar: A Life","Shashi Tharoor");
        Book b2 = new Book("Spare","J. R. Moehringer");

        LibraryCatalog lc = new LibraryCatalog();
        lc.addBook(b1);
        lc.addBook(b2);
        lc.borrowBook("Spare");
        assertFalse(b2.isAvailable());
        lc.returnBook("Spare");
        assertTrue(b2.isAvailable());
        lc.borrowBook("Human Anatomy");
    }
}
