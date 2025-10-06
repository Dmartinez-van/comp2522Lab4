package ca.bcit.comp2522.bookStore;

//TODO ADD JAVADOC COMMENT
/**
 * <>ADD JAVADOC COMMENT</>
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Biography extends Book
                       implements Printable
{
    private Person subject;

    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o)
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

    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nSubject ");
        sb.append(subject);

        return sb.toString();
    }

    @Override
    public void display()
    {
        System.out.println(this);
    }
}
