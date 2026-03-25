package warehouse;

import java.time.LocalDate;

public class StockAdjustment {
    private String id;
    private Product product;
    private LocalDate adjustmentDate;
    private int expectedQuantity;
    private int actualQuantity;
    private int difference;
    private String adjustmentType; // ILUUDEL or DUTAGDAL

    public StockAdjustment() {
    }

    public StockAdjustment(String id, Product product, LocalDate adjustmentDate,
                           int expectedQuantity, int actualQuantity,
                           int difference, String adjustmentType) {
        this.id = id;
        this.product = product;
        this.adjustmentDate = adjustmentDate;
        this.expectedQuantity = expectedQuantity;
        this.actualQuantity = actualQuantity;
        this.difference = difference;
        this.adjustmentType = adjustmentType;
    }

    public String getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getAdjustmentDate() {
        return adjustmentDate;
    }

    public int getExpectedQuantity() {
        return expectedQuantity;
    }

    public int getActualQuantity() {
        return actualQuantity;
    }

    public int getDifference() {
        return difference;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAdjustmentDate(LocalDate adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    public void setExpectedQuantity(int expectedQuantity) {
        this.expectedQuantity = expectedQuantity;
    }

    public void setActualQuantity(int actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public void applyAdjustment(InventoryRecord inventoryRecord) {
    }
}