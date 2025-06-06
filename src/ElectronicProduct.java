package cashregister.src;

/** @Author antonino
 */

/**@Since 28/05/2025
 */
 /** Abbiamo fatto una classe publica chiamata ElectronicProduct che extends cioe estende eredita gli attributi da una classe padre
public class ElectronicProduct extends Product {
    private int warrantyMonths;
*/
/** Abbiamo fatto una classe publica  dove ha dei parametri nome prince ed ecc..
 */
 /**@param name
 * @param price
 * @param warrantyMonths
 */
 /**Abbiamo fatto una classe publica con i parametri che sono nella parentesi tonda e facciamo 2 metodi super e this, il metodo super e lo stesso di quello this , pero solo eredita da una classe padre
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
