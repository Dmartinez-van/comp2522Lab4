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

        this.title         = title;
        this.author        = author;
        this.yearPublished = yearPublished;
    }

    /*
    Checks for null or blank title string. Also checks for length greater
    than a max character limit. Invalid if any expression is true.
    Throws new IllegalArgumentException
     */
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

    /*
    Checks for valid year published, within a lower and upper year boundary.
    Invalid if year falls outside range.
    Throws new IllegalArgumentException
     */
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
     * Getter for title
     *
     * @return title as string
     */
    public String getTitle()
    {
        return title;
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

    /**
     * Prints to screen if the title of an older book, either this or another
     * book's title.
     *
     * @param otherBook another book to compare to this book with. Compares on
     *                  the publishing year.
     */
    public void printOlderBook(final Book otherBook)
    {
        final int compare;
        compare = this.compareTo(otherBook);

        if (compare == 0)
        {
            System.out.println("Books are published in same year");
        }

        else if (compare < 0)
        {
            System.out.printf("%s is older \n", otherBook.getTitle());
        }

        else
        {
            System.out.printf("%s is older \n", this.getTitle());
        }
    }
}
