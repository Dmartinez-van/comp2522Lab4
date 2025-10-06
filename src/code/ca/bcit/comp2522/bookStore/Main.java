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

    birthDate = new Date(15, 3, 1990);
    authorName = new Name("John", "Smith");
    genre = "Science Fiction";
    exampleAuthor = new Author(birthDate, authorName, genre);

    exampleAuthor.display();
    exampleAuthor.backward();
}
}
