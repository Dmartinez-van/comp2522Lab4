package ca.bcit.comp2522.bookStore;

/**
 * A Person is represented by a dateOfBirth, dateOfDeath (optional), and a
 * name.
 * Implements Comparable, Printable, Reversible
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Person implements Printable,
                               Reversible,
                               Comparable<Person>
{
    private static final Date DEFAULT_DEATH_DATE = null;

    private final Date birthDate;
    private final Date deathDate;
    private final Name name;

    /**
     * Full Constructor.
     *
     * @param birthDate the date of birth.
     * @param deathDate the date of death.
     * @param name the Person's first and last name.
     */
    Person(final Date birthDate,
           final Date deathDate,
           final Name name)
    {
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.name      = name;
    }

    /**
     * Partial Constructor, with a {@link #DEFAULT_DEATH_DATE}.
     *
     * @param birthDate the date of birth.
     * @param name the Person's first and last name.
     */
    Person(final Date birthDate,
           final Name name)
    {
        this(birthDate, DEFAULT_DEATH_DATE, name);
    }

    /**
     * Get birthdate.
     *
     * @return birthdate
     */
    public Date getBirthDate()
    {
        return birthDate;
    }

    /**
     * Get deathdate
     *
     * @return deathdate
     */
    public Date getDeathDate()
    {
        return deathDate;
    }

    /**
     * Get name
     *
     * @return name
     */
    public Name getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("Name: ");
        sb.append(name);
        sb.append("\nBirthdate: ");
        sb.append(birthDate);

        if (deathDate != null)
        {
            sb.append("\nDeath Date: ");
            sb.append(deathDate);
        }

        return sb.toString();
    }

    /**
     * Prints all instance data to screen
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Prints to screen a Person's reversed name
     */
    @Override
    public void backward()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(name);
        sb.reverse();

        System.out.println(sb.toString());
    }

    /**
     * compareTo implementation that compares two People based on their {@link #birthDate}.
     *
     * @param that the {@link Person} to be compared to this Person.
     * @return 0 if the two Persons have the same birthdate,
     *         a negative integer if this Person was born before that Person,
     *         and a positive integer if this Person was born after that Person.
     */
    @Override
    public int compareTo(final Person that)
    {
        final int yearComparison;
        final int monthComparison;
        final int dayComparison;

        yearComparison = Integer.compare(this.birthDate.getYear(),
                                         that.birthDate.getYear());

        if (yearComparison != 0)
        {
            return yearComparison;
        }

        monthComparison = Integer.compare(this.birthDate.getMonth(),
                                          that.birthDate.getMonth());

        if (monthComparison != 0)
        {
            return monthComparison;
        }

        dayComparison = Integer.compare(this.birthDate.getDay(),
                                        that.birthDate.getDay());
        return dayComparison;

        // objects are equal
    }
}
