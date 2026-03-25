package warehouse;

public class InventoryRecord {
    private Product product;
    private int quantityOnHand;

    public InventoryRecord() {
    }

    public InventoryRecord(Product product, int quantityOnHand) {
        this.product = product;
        this.quantityOnHand = quantityOnHand;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public void increaseQuantity(int amount) {
    }

    public void decreaseQuantity(int amount) {
    }

    public void updateQuantity(int newQuantity) {
    }
}