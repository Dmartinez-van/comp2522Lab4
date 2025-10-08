package ca.bcit.comp2522.bookStore;

/**
 * Author is composed of:
 * <ul>
 *     <li>a {@link Name} name</li>
 *     <li>a {@link Date} birthdate</li>
 *     <li>a {@link String} genre</li>
 *     <li>a {@link Date} deathdate (optional)</li>
 *</ul>
 * Implements Printable
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Author extends Person
                    implements Printable
{
    private static final int GENRE_MAX_CHAR_LIMIT = 30;

    private final String genre;

    /**
     * Full constructor. Initializes object with data.
     *
     * @param birthDate a {@link Date} birthdate
     * @param deathDate a {@link Date} deathdate
     * @param name      a {@link Name} name
     * @param genre     a {@link String} genre
     */
    public Author(final Date birthDate,
                  final Date deathDate,
                  final Name name,
                  final String genre)
    {
        super (birthDate, deathDate, name);

        checkGenreString(genre);
        this.genre = genre;
    }

    /**
     * Partial Constructor with no deathdate.
     *
     * @param birthDate a {@link Date} birthdate
     * @param name      a {@link Name} name
     * @param genre     a {@link String} genre
     */
    public Author (final Date birthDate,
                   final Name name,
                   final String genre)
    {
        super (birthDate, name);
        this.genre = genre;
    }

    /*
    Check for null and blankness. Invalid if either is true.
    Throws new IllegalArgumentException

    Check against max character limit, invalid if it exceeds.
    Throws new IllegalArgumentException
     */
    private void checkGenreString(final String genre)
    {
        if(genre == null || genre.isBlank())
        {
            throw new IllegalArgumentException("Genre cannot be null or blank");
        }
        if (genre.length() > GENRE_MAX_CHAR_LIMIT)
        {
            throw new IllegalArgumentException("Genre cannot be longer than " +
                    GENRE_MAX_CHAR_LIMIT);
        }
    }

    /**
     * Returns string sentence with object's instance data
     *
     * @return a string sentence with object's instance data
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("Author ");
        sb.append(super.toString());
        sb.append("\nGenre: ");
        sb.append(genre);

        return sb.toString();
    }

    /**
     * Prints to screen objects instance data
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Prints to screen which author is older, or if equal in age (years).
     * @param otherAuthor another author
     */
    public void printOlderAuthor(final Author otherAuthor)
    {
        final int compare;
        compare = this.compareTo(otherAuthor);

        if (compare == 0)
        {
            System.out.println("Both authors are same age in years");
        }

        else if (compare > 0)
        {
            System.out.printf("%s is older \n", this.getName());
        }

        else
        {
            System.out.printf("%s is older \n", otherAuthor.getName());
        }
    }
}
