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

    public Name(String first, String last)
    {
        checkNameString(first);
        checkNameString(last);

        this.first = first;
        this.last = last;
    }

    private void checkNameString(String name)
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

    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("First name: ");
        sb.append(first);
        sb.append("\nLast name: ");
        sb.append(last);

        return sb.toString();
    }

    /**
     * Prints all instance variables of self and parent class.
     *
     * @return a string sentence with all self and parent class
     *         instance variables.
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }


}
