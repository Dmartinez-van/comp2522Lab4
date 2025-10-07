package ca.bcit.comp2522.bookStore;

/**
 * Book is represented by a title, yearPublished, and an author
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Book implements Printable,
                             Reversible,
                             Comparable<Book>
{
    private static final int TITLE_MAX_CHAR_LIMIT = 100;
    private static final int YEAR_LOWER_LIMIT     = 1;
    private static final int YEAR_UPPER_LIMIT     = Date.getCurrentYear();

    private final String title;
    private final Author author;
    private final int    yearPublished;

    /**
     * Full constructor.
     *
     * @param title a title
     * @param yearPublished the year published
     * @param author the author
     */
    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        checkTitleString(title);
        checkYearPublished(yearPublished);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    private static void checkTitleString(final String title)
    {
        if (title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (title.length() > TITLE_MAX_CHAR_LIMIT)
        {
            throw new IllegalArgumentException("Title cannot be longer than " +
                    TITLE_MAX_CHAR_LIMIT);
        }
    }

    private static void checkYearPublished(final int yearPublished)
    {
        if (yearPublished < YEAR_LOWER_LIMIT || yearPublished > YEAR_UPPER_LIMIT)
        {
            throw new IllegalArgumentException("Year published must be between " +
                                                YEAR_LOWER_LIMIT + " and " +
                                                YEAR_UPPER_LIMIT);
        }
    }

    /**
     * Returns instance data as string
     *
     * @return instance data as string
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("Title: ");
        sb.append(title);
        sb.append("\nYear Published: ");
        sb.append(yearPublished);
        sb.append("\n");
        sb.append(author);

        return sb.toString();
    }

    /**
     * Prints to screen instance data
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Prints to screen instance's {@link #title} reversed
     */
    @Override
    public void backward()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(title);
        sb.reverse();

        System.out.println(sb.toString());
    }

    /**
     * Compares 2 {@link Book} objects.
     * Compares objects based on {@link #yearPublished}
     * Older books are considered 'larger'
     *
     * @param that another {@link Book} to compare against
     * @return 0 if objects are published in same year
     *         positive int if this object is older (published earlier)
     *         negative int if this object is newer (published more recently)
     */
    @Override
    public int compareTo(final Book that)
    {
        return that.yearPublished - this.yearPublished;
    }
}
