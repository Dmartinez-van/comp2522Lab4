package ca.bcit.comp2522.bookStore;

/**
 * Name class with a First and Last name.
 * Implements Printable
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Name implements Printable
{
    private static final int NAME_CHAR_LIMIT = 50;

    private final String first;
    private final String last;

    /**
     * Full constructor.
     *
     * @param first a first name
     * @param last a last name
     */
    public Name(final String first,
                final String last)
    {
        checkNameString(first);
        checkNameString(last);

        this.first = first;
        this.last = last;
    }

    private void checkNameString(final String name)
    {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (name.length() > NAME_CHAR_LIMIT)
        {
            throw new IllegalArgumentException("Name cannot be longer than " +
                                                NAME_CHAR_LIMIT);
        }
    }

    /**
     * Get first name.
     *
     * @return first name as string.
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Get last name.
     *
     * @return last name as string.
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Returns a string of {@link #first} and {@link #last} names
     *
     * @return a string
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(first);
        sb.append(" ");
        sb.append(last);

        return sb.toString();
    }

    /**
     * Prints all instance variables of self and parent class.
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }
}
