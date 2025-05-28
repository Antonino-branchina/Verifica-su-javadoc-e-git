package cashregister.src;

/** @Author Antonino
 * @Since 28/05/2025
 */
public class FoodProduct extends Product {
    private String expirationDate;

    /**Abbiamo fatto una classe DoodProduct dove usa i parametri e usa i metodi super e this il metodo super e lo stesso di quello this, pero quello super ederetida dalla classe padre.
     *
     * @param name
     * @param price
     * @param expirationDate
     */
    public FoodProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getCategory() {
        return "Food";
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
