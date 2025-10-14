package ca.bcit.comp2522.bookStore;

/**
 * Runner class for comp2522 lab 4
 * Tests various classes and their methods for correctness
 *
 * @author David Martinez,
 *         Daniel Do
 * @version 1.0
 */
public class Main
{
    /**
     * Entry point for the Book Store application.
     * This method launches the application and demonstrates usage of the {@link Author} class.
     *
     * @param args the command line arguments provided to the program
     */
    public static void main(final String[] args)
    {
        // Create 5 of the Greatest Books
        // ---- Start ----
        final Book book1;
        final Book book2;
        final Book book3;
        final Book book4;
        final Book book5;

        final Author author1Book;
        final Author author2Book;
        final Author author3Book;
        final Author author4Book;
        final Author author5Book;

        final Date author1DOB;
        final Date author2DOB;
        final Date author3DOB;
        final Date author4DOB;
        final Date author5DOB;

        final Date author1DOD;
        final Date author2DOD;
        final Date author3DOD;
        final Date author4DOD;
        final Date author5DOD;

        // George Orwell
        author1DOB = new Date(25, 6, 1903);  // June 25, 1903
        author1DOD = new Date(21, 1, 1950);  // January 21, 1950

        // Harper Lee
        author2DOB = new Date(28, 4, 1926);  // April 28, 1926
        author2DOD = new Date(19, 2, 2016);  // February 19, 2016

        // Jane Austen
//        author3DOB = new Date(16, 12, 1775); // December 16, 1775
//        author3DOD = new Date(18, 7, 1817);  // July 18, 1817

        // F. Scott Fitzgerald
        author4DOB = new Date(24, 9, 1896);  // September 24, 1896
        author4DOD = new Date(21, 12, 1940); // December 21, 1940

        // Herman Melville
        author5DOB = new Date(1, 8, 1819);   // August 1, 1819
        author5DOD = new Date(28, 9, 1891);  // September 28, 1891

        author1Book = new Author(author1DOB, author1DOD, new Name("George",  "Orwell"), "Sci-fi");
        author2Book = new Author(author2DOB, author2DOD, new Name("Harper", "Lee"), "Literary Fiction");
//        author3Book = new Author(author3DOB, author3DOD, new Name("Jane", "Austen"), "Romance");
        author4Book = new Author(author4DOB, author4DOD, new Name("F. Scott", "Fitzgerald"), "Literary Fiction");
        author5Book = new Author(author5DOB, author5DOD, new Name("Herman", "Melville"), "Adventure");

        Date book1Publication = new Date(1, 1, 1949);  // 1984
        Date book2Publication = new Date(1, 1, 1960);  // To Kill a Mockingbird
//        Date book3Publication = new Date(1, 1, 1813);  // Pride and Prejudice
        Date book4Publication = new Date(1, 1, 1925);  // The Great Gatsby
        Date book5Publication = new Date(1, 1, 1851);  // Moby-Dick

        // George Orwell
        book1 = new Book("1984", 1949, author1Book);

        // Harper Lee
        book2 = new Book("To Kill a Mockingbird", 1960, author2Book);

        // Jane Austen
//        book3 = new Book("Pride and Prejudice", 1813, author3Book);

        // F. Scott Fitzgerald
        book4 = new Book("The Great Gatsby", 1925, author4Book);

        // Herman Melville
        book5 = new Book("Moby-Dick", 1851, author5Book);

        // COMPARE BOOKS BY PUBLICATION YEAR
        System.out.println("COMPARING BY PUBLICATION YEAR...");
        System.out.println("Book 1: '" + book1.getTitle() + "' from " + book1Publication);
        System.out.println("Book 2: '" + book2.getTitle() + "' from " + book2Publication);
        System.out.print("Compare Book 2 and Book 1 : ");
        book2.printOlderBook(book1);
        System.out.println("Book 4: '" + book4.getTitle() + "' from " + book4Publication);
        System.out.print("Compare Book 2 and Book 4 : ");
        book2.printOlderBook(book4);

        System.out.println();

        // COMPARE BOOKS BY AUTHORS BY DOB
        System.out.println("COMPARING BY DOB...");
        System.out.println("George Orwell compared to Herman Melville (age in years)");
        author1Book.printOlderAuthor(author5Book);

        // ---- End of Book ----

        // ---- Start Biographies ----
        // The Power Broker by Robert Caro
        Person robertMosesPerson = new Person(new Date(18, 12, 1888), new Date(29, 7, 1981), new Name("Robert", "Moses"));
        Author robertCaroAuthor  = new Author(new Date(30, 10, 1935), new Name("Robert", "Caro"), "Political");
        Biography bio1 = new Biography("The Power Broker", 1974, robertCaroAuthor, robertMosesPerson);

        // Steve Jobs by Walter Isaacson
        Person steveJobsPerson = new Person(new Date(24, 2, 1955), new Date(5, 10, 2011), new Name("Steve", "Jobs"));
        Author walterIsaacsonAuthor = new Author(new Date(20, 5, 1952), new Name("Walter", "Isaacson"), "Biography");
        Biography bio2 = new Biography("Steve Jobs", 2011, walterIsaacsonAuthor, steveJobsPerson);

        // Churchill: A Life by Martin Gilbert
        Person winstonChurchillPerson = new Person(new Date(30, 11, 1874), new Date(24, 1, 1965), new Name("Winston", "Churchill"));
        Author martinGilbertAuthor = new Author(new Date(25, 10, 1936), new Date(3, 2, 2015), new Name("Martin", "Gilbert"), "Historical Biography");
        Biography bio3 = new Biography("Churchill: A Life", 1991, martinGilbertAuthor, winstonChurchillPerson);

        // Alexander Hamilton by Ron Chernow
        Person alexanderHamiltonPerson = new Person(new Date(11, 1, 1801), new Date(12, 7, 1804), new Name("Alexander", "Hamilton"));
        Author ronChernowAuthor = new Author(new Date(3, 3, 1949), new Name("Ron", "Chernow"), "Historical Biography");
        Biography bio4 = new Biography("Alexander Hamilton", 2004, ronChernowAuthor, alexanderHamiltonPerson);

        // Einstein: His Life and Universe by Walter Isaacson
        Person albertEinsteinPerson = new Person(new Date(14, 3, 1879), new Date(18, 4, 1955), new Name("Albert", "Einstein"));
        Biography bio5 = new Biography("Einstein: His Life and Universe", 2007, walterIsaacsonAuthor, albertEinsteinPerson);
        Biography bio5Same = new Biography("Einstein: His Life and Universe", 2007, walterIsaacsonAuthor, albertEinsteinPerson);

        // COMPARE BIOGRAPHIES BY SUBJECT
        System.out.println("----COMPARING (equality check) BIOGRAPHIES BY SUBJECT----");
        System.out.println("Bio5 equal to bio3? [diff subjects]");
        System.out.println(bio5.equals(bio3));
        System.out.println("Bio5 equal to bio5Same? [same subject]");
        System.out.println(bio5Same.equals(bio5));
        System.out.println();

        // ---- END Biographies ----

        // ---- START Autobiographies ----
        // The Diary of a Young Girl by Anne Frank
        Person anneFrankPerson = new Person(new Date(12, 6, 1929), new Date(12, 3, 1945), new Name("Anne", "Frank"));
        Author anneFrankAuthor = new Author(new Date(12, 6, 1929), new Date(12, 3, 1945), new Name("Anne", "Frank"), "Autobiography");
        Autobiography auto1 = new Autobiography("The Diary of a Young Girl", 1947, anneFrankAuthor);

        // Long Walk to Freedom by Nelson Mandela
        Person nelsonMandelaPerson = new Person(new Date(18, 7, 1918), new Date(5, 12, 2013), new Name("Nelson", "Mandela"));
        Author nelsonMandelaAuthor = new Author(new Date(18, 7, 1918), new Date(5, 12, 2013), new Name("Nelson", "Mandela"), "Autobiography");
        Autobiography auto2 = new Autobiography("Long Walk to Freedom", 1994, nelsonMandelaAuthor);

        // The Story of My Experiments with Truth by Mahatma Gandhi
        Person mahatmaGandhiPerson = new Person(new Date(2, 10, 1869), new Date(30, 1, 1948), new Name("Mahatma", "Gandhi"));
        Author mahatmaGandhiAuthor = new Author(new Date(2, 10, 1869), new Date(30, 1, 1948), new Name("Mahatma", "Gandhi"), "Autobiography");
        Autobiography auto3 = new Autobiography("The Story of My Experiments with Truth", 1927, mahatmaGandhiAuthor);

        // I Know Why the Caged Bird Sings by Maya Angelou
        Person mayaAngelouPerson = new Person(new Date(4, 4, 1928), new Date(28, 5, 2014), new Name("Maya", "Angelou"));
        Author mayaAngelouAuthor = new Author(new Date(4, 4, 1928), new Date(28, 5, 2014), new Name("Maya", "Angelou"), "Autobiography");
        Autobiography auto4 = new Autobiography("I Know Why the Caged Bird Sings", 1969, mayaAngelouAuthor);

        // Autobiography of Malcolm X by Malcolm X
        Person malcolmXPerson = new Person(new Date(19, 5, 1925), new Date(21, 2, 1965), new Name("Malcolm", "X"));
        Author malcolmXAuthor = new Author(new Date(19, 5, 1925), new Date(21, 2, 1965), new Name("Malcolm", "X"), "Autobiography");
        Autobiography auto5 = new Autobiography("Autobiography of Malcolm X", 1965, malcolmXAuthor);

        // COMPARING AUTOBIOGRAPHIES
        System.out.println("Equal? auto 5 with auto 1");
        System.out.println(auto5.equals(auto1));
        System.out.println("Equal with self? auto 2 with auto 2");
        System.out.println(auto2.equals(auto2));
        System.out.println();

        // ---- End of Autobiographies ----

        // Playing with Printable and Reversible
        System.out.println("Display on auto5:");
        auto5.display();
        System.out.println();

        System.out.println("Backwards on auto5");
        auto5.backward();
        System.out.println();

        System.out.println("Display with Author F. Scoot Fitzgerald:");
        author1Book.display();
        System.out.println();

        System.out.println("Backwards on author 1");
        author1Book.backward();
        System.out.println();
    }
}
