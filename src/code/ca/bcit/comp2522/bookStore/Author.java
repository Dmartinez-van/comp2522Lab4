package ca.bcit.comp2522.bookStore;

//TODO ADD JAVADOC COMMENT
/**
 * <>ADD JAVADOC COMMENT</>
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Author extends Person
                    implements Printable
{
    private static final int NAME_CHAR_LIMIT = 30;

    private final String genre;

    public Author(final Date birthDate,
                  final Date deathDate,
                  final Name name,
                  final String genre)
    {
        super (birthDate, deathDate, name);

        checkGenreString(genre);
        this.genre = genre;
    }

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
        if (genre.length() > NAME_CHAR_LIMIT)
        {
            throw new IllegalArgumentException("Genre cannot be longer than " +
                                                NAME_CHAR_LIMIT);
        }
    }

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

    @Override
    public void display()
    {
        System.out.println(this);
    }

}
