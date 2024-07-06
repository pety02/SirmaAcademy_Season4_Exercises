package professionalAcademyPart.week4_lecture2.task1;

public class BookRepo implements RepositoryManageable<Book> {
    // I decided it would be better the InvoiceRepo class to implements a template interface
    // RepositoryManageable because of common functionality as InvoiceRepo class.
    public void save(Book book) {
        // Save book to the database
    }
}