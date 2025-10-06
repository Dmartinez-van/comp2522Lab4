package ca.bcit.comp2522.bookStore;

//TODO ADD JAVADOC COMMENT
/**
 * <>ADD JAVADOC COMMENT</>
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Autobiography extends Biography
                           implements Printable
{
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author)
    {
        super(title, yearPublished, author, author);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();
        sb.append(super.toString());

        return sb.toString();
    }

    @Override
    public void display()
    {
        System.out.println(this);
    }
}
