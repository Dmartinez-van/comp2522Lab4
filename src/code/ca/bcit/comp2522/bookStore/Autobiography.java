package ca.bcit.comp2522.bookStore;

/**
 * An Autobiography extends {@link Biography}.
 * The difference is that an Autobiography is written
 * by the subject.
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Autobiography extends Biography
                           implements Printable
{
    /**
     * Full constructor.
     *
     * @param title the title
     * @param yearPublished the year published
     * @param author the author and subject
     */
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author)
    {
        super(title, yearPublished, author, author);
    }

    /**
     * Returns a string of instance data
     *
     * @return a string of instance data
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(super.toString());

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
}
