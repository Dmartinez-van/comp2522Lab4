package ca.bcit.comp2522.bookStore;

/**
 * A Person is represented by a dateOfBirth, dateOfDeath (optional), and a
 * name.
 * Implements Comparable, Printable, Reversible
 *
 * @author David Martinez,
 * Daniel Do
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
        checkBirthVsDeath(birthDate, deathDate);

        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.name      = name;
    }

    /**
     * Partial Constructor, with a {@link #DEFAULT_DEATH_DATE}.
     * @param birthDate the date of birth.
     * @param name the Person's first and last name.
     */
    Person(final Date birthDate,
           final Name name)
    {
        this.birthDate = birthDate;
        this.deathDate = DEFAULT_DEATH_DATE;
        this.name      = name;
    }

    void checkBirthVsDeath(final Date birth,
                           final Date death)
    {
        //TODO: Compare birth and death dates. Throw new exception if birth is after death.
        //TODO: Might be worth making a compareTo method in Date class then using here?
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

    /**
     * JAVA DOC HERE
     * @return
     */
    @Override
    public String display()
    {
        final StringBuilder sb;
        sb  = new StringBuilder();

        sb.append("Name = ");
        sb.append(name.getFirstName());
        sb.append(" ");
        sb.append(name.getLastName());
        sb.append("\nBirthdate = ");
        sb.append(birthDate.toString());

        if (deathDate != null)
        {
            sb.append("\nDeathdate = ");
            sb.append(deathDate.toString());
        }

        return sb.toString();
    }

    /**
     * JAVA DOC HERE
     * @return
     */
    @Override
    public String backward()
    {
        return "";
    }

    /**
     * JAVA DOC HERE
     * @return
     */
    @Override
    public int compareTo(Person o)
    {
        return 0;
    }
}
