package ca.bcit.comp2522.bookStore;

/**
 * SAM Interface
 * Asks implementors to implement {@link #display()} which
 * prints to screen all instance data for the calling object.
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public interface Printable
{
    /**
     * Prints every instance variable (including those in parent classes)
     * in a sentence.
     */
    void display();
}
