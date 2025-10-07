package ca.bcit.comp2522.bookStore;

/**
 * A Biography extends {@link Book}
 * Represents a {@link Book} is a subclass because it's
 * content is centered on a particular {@link Person}
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Biography extends Book
                       implements Printable
{
    private final Person subject;

    /**
     * Full constructor
     *
     * @param title the title
     * @param yearPublished the year published
     * @param author the author
     * @param subject the subject of the book
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);
        this.subject = subject;
    }

    /**
     * Checks for equality between 2 {@link Biography} objects
     *
     * @param o   the reference object with which to compare.
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == null)
        {
            return false;
        }
        if (!(o.getClass().equals(this.getClass())))
        {
            return false;
        }
        final Biography that;
        that = (Biography) o;

        return this.subject.equals(that.subject);
    }

    /**
     * Returns objects hashcode
     *
     * @return an int representing object's hashcode
     */
    @Override
    public int hashCode()
    {
        return this.subject.hashCode();
    }

    /**
     * Returns string of object's instance data
     *
     * @return a string of instance data
     */
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nSubject ");
        sb.append(subject);

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
