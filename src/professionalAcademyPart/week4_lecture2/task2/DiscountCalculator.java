package professionalAcademyPart.week4_lecture2.task2;

public class DiscountCalculator {
    // Only modified String parameter type to enum because the enum ensures
    // that there will be several different types and we will not forget for any of them.
    public double calculateDiscount(DiscountType type, double price) {
        if (DiscountType.STUDENT.equals(type)) {
            return price * 0.1;
        } else if (DiscountType.SENIOR.equals(type)) {
            return price * 0.2;
        }
        return price;
    }
}