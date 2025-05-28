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
    Sotto il costruttore abbiamo messo il metodo this che vuol dire questo parametro e uguale all'attributo esterno
    @Param i parametri sono product e quantity
    }
   Abbiamo fatto il metodo get che ci ritorna un valore
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
    Abbiamo fatto il metodo get e ci ritorna product
    public Product getProduct() {
        return product;
    }
    Ora abbiamo fatto il meotodo get con la quantita
    public int getQuantity() {
        return quantity;
    e ci ritorna la quantita
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
