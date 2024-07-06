package professionalAcademyPart.week4_lecture2.task1;

public class invoiceRepo implements RepositoryManageable<Invoice> {
    // I decided it would be better the InvoiceRepo class to implements a template interface
    // RepositoryManageable because of common functionality as BookRepo class.
    @Override
    public void save(Invoice invoice) {
        // Save invoice to database
    }
}