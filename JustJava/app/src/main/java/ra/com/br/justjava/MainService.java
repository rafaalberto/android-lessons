package ra.com.br.justjava;

public class MainService {

    private static final int UNITY_PRICE = 5;
    private static final int ONE = 1;

    int quantity = ONE;

    public int increment() {
        return quantity = quantity + ONE;
    }

    public int decrement() {
        if (quantity > ONE) {
            return quantity = quantity - ONE;
        }
        return quantity;
    }

    public void resetOrder() {
        quantity = ONE;
    }

    public String createOrderSummary(String name, boolean hasWhippedCream, boolean hasChocolate) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + name)
                .append("\nQuantity: " + quantity)
                .append("\nTotal: $ " + calculatePrice(quantity))
                .append("\nAdd Whipped Cream? " + (hasWhippedCream == true ? "Yes" : "No"))
                .append("\nAdd Chocolate? " + (hasChocolate == true ? "Yes" : "No"))
                .append("\nThank you!");
        return stringBuilder.toString();
    }

    private int calculatePrice(int quantity) {
        return quantity * UNITY_PRICE;
    }
}
