package warehouse;

import java.time.LocalDate;

public class StockCount {
    private String id;
    private Warehouse warehouse;
    private Product product;
    private LocalDate countDate;
    private int actualQuantity;
    private StockAdjustment adjustment;

    public StockCount() {
    }

    public StockCount(String id, Warehouse warehouse, Product product,
                      LocalDate countDate, int actualQuantity,
                      StockAdjustment adjustment) {
        this.id = id;
        this.warehouse = warehouse;
        this.product = product;
        this.countDate = countDate;
        this.actualQuantity = actualQuantity;
        this.adjustment = adjustment;
    }

    public String getId() {
        return id;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getCountDate() {
        return countDate;
    }

    public int getActualQuantity() {
        return actualQuantity;
    }

    public StockAdjustment getAdjustment() {
        return adjustment;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCountDate(LocalDate countDate) {
        this.countDate = countDate;
    }

    public void setActualQuantity(int actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public void setAdjustment(StockAdjustment adjustment) {
        this.adjustment = adjustment;
    }

    public StockAdjustment calculateDifference() {
        return null;
    }

    public void performStockCount() {
    }
}