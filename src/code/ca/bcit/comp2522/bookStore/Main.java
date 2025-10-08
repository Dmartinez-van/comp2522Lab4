package ca.bcit.comp2522.bookStore;

/**
 * Runner class for comp2522 lab 4
 * Tests various classes and their methods for correctness
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Main
{
    /**
     * Entry point for the Book Store application.
     * This method launches the application and demonstrates usage of the {@link Author} class.
     *
     * @param args the command line arguments provided to the program
     */
    public static void main(final String[] args)
    {
        // Create 5 of the Greatest Books
        // ---- Start ----
        final Book book1;
        final Book book2;
        final Book book3;
        final Book book4;
        final Book book5;

        final Author author1Book;
        final Author author2Book;
        final Author author3Book;
        final Author author4Book;
        final Author author5Book;

        final Date author1DOB;
        final Date author2DOB;
        final Date author3DOB;
        final Date author4DOB;
        final Date author5DOB;

        final Date author1DOD;
        final Date author2DOD;
        final Date author3DOD;
        final Date author4DOD;
        final Date author5DOD;

        // George Orwell
        author1DOB = new Date(25, 6, 1903);  // June 25, 1903
        author1DOD = new Date(21, 1, 1950);  // January 21, 1950

        // Harper Lee
        author2DOB = new Date(28, 4, 1926);  // April 28, 1926
        author2DOD = new Date(19, 2, 2016);  // February 19, 2016

        // Jane Austen
//        author3DOB = new Date(16, 12, 1775); // December 16, 1775
//        author3DOD = new Date(18, 7, 1817);  // July 18, 1817

        // F. Scott Fitzgerald
        author4DOB = new Date(24, 9, 1896);  // September 24, 1896
        author4DOD = new Date(21, 12, 1940); // December 21, 1940

        // Herman Melville
        author5DOB = new Date(1, 8, 1819);   // August 1, 1819
        author5DOD = new Date(28, 9, 1891);  // September 28, 1891

        author1Book = new Author(author1DOB, author1DOD, new Name("George",  "Orwell"), "Sci-fi");
        author2Book = new Author(author2DOB, author2DOD, new Name("Harper", "Lee"), "Literary Fiction");
//        author3Book = new Author(author3DOB, author3DOD, new Name("Jane", "Austen"), "Romance");
        author4Book = new Author(author4DOB, author4DOD, new Name("F. Scott", "Fitzgerald"), "Literary Fiction");
        author5Book = new Author(author5DOB, author5DOD, new Name("Herman", "Melville"), "Adventure");

        Date book1Publication = new Date(1, 1, 1949);  // 1984
        Date book2Publication = new Date(1, 1, 1960);  // To Kill a Mockingbird
//        Date book3Publication = new Date(1, 1, 1813);  // Pride and Prejudice
        Date book4Publication = new Date(1, 1, 1925);  // The Great Gatsby
        Date book5Publication = new Date(1, 1, 1851);  // Moby-Dick

        // George Orwell
        book1 = new Book("1984", 1949, author1Book);

        // Harper Lee
        book2 = new Book("To Kill a Mockingbird", 1960, author2Book);

        // Jane Austen
//        book3 = new Book("Pride and Prejudice", 1813, author3Book);

        // F. Scott Fitzgerald
        book4 = new Book("The Great Gatsby", 1925, author4Book);

        // Herman Melville
        book5 = new Book("Moby-Dick", 1851, author5Book);

        // COMPARE BOOKS BY PUBLICATION YEAR
        System.out.println("COMPARING BY PUBLICATION YEAR...");
        System.out.println("Book 1: '" + book1.getTitle() + "' from " + book1Publication);
        System.out.println("Book 2: '" + book2.getTitle() + "' from " + book2Publication);
        System.out.print("Compare Book 2 and Book 1 : ");
        book2.printOlderBook(book1);
        System.out.println("Book 4: '" + book4.getTitle() + "' from " + book4Publication);
        System.out.print("Compare Book 2 and Book 4 : ");
        book2.printOlderBook(book4);

        System.out.println();

        // COMPARE BOOKS BY AUTHORS BY DOB
        System.out.println("COMPARING BY DOB...");
        System.out.println("George Orwell compared to Herman Melville (age in years)");
        author1Book.printOlderAuthor(author5Book);

        // ---- End of Book ----

        // ---- Start Biographies ----




    }
}
