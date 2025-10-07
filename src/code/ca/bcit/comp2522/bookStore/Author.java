package ca.bcit.comp2522.bookStore;

/**
 * Author is composed of:
 * <ul>
 *     <li>a {@link Name} name</li>
 *     <li>a {@link Date} birthdate</li>
 *     <li>a {@link String} genre</li>
 *     <li>a {@link Date} deathdate (optional)</li>
 *</ul>
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Author extends Person
                    implements Printable
{
    private static final int GENRE_CHAR_LIMIT = 30;

    private final String genre;

    /**
     * Full constructor. Initializes object with data.
     *
     * @param birthDate a birthdate
     * @param deathDate a deathdate
     * @param name a name
     * @param genre a genre
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
     * @param birthDate a birthdate
     * @param name a name
     * @param genre a genre
     */
    public Author (final Date birthDate,
                   final Name name,
                   final String genre)
    {
        super (birthDate, name);
        this.genre = genre;
    }

    private void checkGenreString(final String genre)
    {
        if(genre == null || genre.isBlank())
        {
            throw new IllegalArgumentException("Genre cannot be null or blank");
        }
        if (genre.length() > GENRE_CHAR_LIMIT)
        {
            throw new IllegalArgumentException("Genre cannot be longer than " +
                    GENRE_CHAR_LIMIT);
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

}
