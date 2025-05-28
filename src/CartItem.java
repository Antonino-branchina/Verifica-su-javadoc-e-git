package cashregister.src;

public class CartItem {
    private Product product;
    private int quantity;
    /**
@Author Antonino
    @Since 28/05/2025
    Abbiamo creato un costruttore public, e ci passiamo come parametri product, quantity.
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    Sotto il costruttore abbiamo messo il metodo thi
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    public void decreaseQuantity(int amount) {
        if (amount > 0 && quantity - amount > 0) {
            quantity -= amount;
        }
    }
}
