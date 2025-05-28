package cashregister.src;

/** @Author antonino
 */

/**@Since 28/05/2025
 */
 /** Abbiamo fatto una classe publica chiamata ElectronicProduct che extends cioe estende eredita gli attributi da una classe padre
public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}
