public class Product {
    protected int code;
    protected double price;
    protected boolean taxEligible;
    int quantity;
    String name;

    Product(double newPrice, int newCode, boolean eligibility, String newName) {
        price = newPrice;
        code = newCode;
        taxEligible = eligibility;
        name = newName;
    }

    void SetQuantity(int quant) {
        quantity = quant;
    }
}
