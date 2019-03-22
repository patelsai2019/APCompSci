import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1.49, 1, true, "Apple, Fuji"));
        inventory.get(0).SetQuantity(25);
    }
}
