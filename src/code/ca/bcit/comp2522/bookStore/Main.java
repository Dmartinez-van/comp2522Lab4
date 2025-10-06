package ca.bcit.comp2522.bookStore;

//TODO ADD JAVADOC COMMENT
/**
 * <>ADD JAVADOC COMMENT</>
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
        final Date birthDate;
        final Name authorName;
        final String genre;
        final Author exampleAuthor;
        final int birthDay;
        final int birthMonth;
        final int birthYear;
        final Date authorBirthDate;
        final Name authorName2;
        final String authorGenre;
        final Author exampleAuthor2;
        final String bookTitle;
        final int yearPublished;
        final Book exampleBook;

        birthDate = new Date(15, 3, 1990);
        authorName = new Name("John", "Smith");
        genre = "Science Fiction";
        exampleAuthor = new Author(birthDate, authorName, genre);

        exampleAuthor.display();
        exampleAuthor.backward();

        birthDay = 15;
        birthMonth = 3;
        birthYear = 1990;
        authorBirthDate = new Date(birthDay, birthMonth, birthYear);
        authorName2 = new Name("John", "Smith");
        authorGenre = "Science Fiction";
        exampleAuthor2 = new Author(authorBirthDate, authorName, authorGenre);

        bookTitle = "Journey to Mars";
        yearPublished = 2024;
        exampleBook = new Book(bookTitle, yearPublished, exampleAuthor);

        System.out.println(exampleBook);
    }
}
