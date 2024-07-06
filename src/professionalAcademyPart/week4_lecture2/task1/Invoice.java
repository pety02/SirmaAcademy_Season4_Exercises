package professionalAcademyPart.week4_lecture2.task1;

public class Invoice {
    private double amount;
    private String customerName;

    public Invoice() {
        this(0.0, "");
    }
    public Invoice(double amount, String customerName) {
        this.setAmount(amount);
        this.setCustomerName(customerName);
    }

    // This method can be implemented here if it would print the object only
    // on the console. In other case it can be part of other class InvoicePrinter
    // and to tell it where and how to store this object. Also, it would be good idea
    // to override toString() method for each object if we want different representation
    // of it instead of the basic one.
    public void printInvoice() {
        // Print invoice
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}