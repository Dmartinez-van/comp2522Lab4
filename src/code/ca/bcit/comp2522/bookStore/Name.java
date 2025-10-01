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

    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName)
    {
        checkNameString(firstName);
        checkNameString(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    void checkNameString(String name)
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
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Get last name.
     *
     * @return last name as string.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Prints all instance variables of self and parent class.
     *
     * @return a string sentence with all self and parent class
     *         instance variables.
     */
    @Override
    public String display()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("First name: ");
        sb.append(firstName);
        sb.append("\nLast name: ");
        sb.append(lastName);
        sb.append("\n");

        return sb.toString();
    }
}
