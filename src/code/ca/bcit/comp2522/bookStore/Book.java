package ca.bcit.comp2522.bookStore;

//TODO ADD JAVADOC COMMENT
/**
 * <>ADD JAVADOC COMMENT</>
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Book implements Printable,
                             Reversible,
                             Comparable<Book>
{
    public static final int TITLE_CHAR_LIMIT = 100;
    public static final int YEAR_LOWER_LIMIT = 1;
    public static final int YEAR_UPPER_LIMIT = Date.getCurrentYear();

    private final String title;
    private final int yearPublished;
    private final Author author;

    public Book (final String title,
                 final int yearPublished,
                 final Author author)
    {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    private static void checkTitleString(final String title)
    {
        if(title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (title.length() > TITLE_CHAR_LIMIT)
        {
            throw new IllegalArgumentException("Title cannot be longer than " +
                                                TITLE_CHAR_LIMIT);
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

    @Override
    public void display()
    {
        System.out.println(this);
    }

    @Override
    public void backward()
    {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(title);
        sb.reverse();

        System.out.println(sb.toString());
    }

    @Override
    public int compareTo(Book that)
    {
        return Integer.compare(this.yearPublished, that.yearPublished);
    }
}
