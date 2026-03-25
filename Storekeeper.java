package warehouse;

import java.time.LocalDate;
import java.util.List;

public class Storekeeper {
    private String id;
    private String fullName;
    private Warehouse warehouse;

    public Storekeeper() {
    }

    public Storekeeper(String id, String fullName, Warehouse warehouse) {
        this.id = id;
        this.fullName = fullName;
        this.warehouse = warehouse;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public GoodsReceipt receiveGoods(String receiptNumber, LocalDate receivedDate,
                                     Person deliveredBy, List<ReceiptItem> items) {
        return null;
    }

    public GoodsIssue issueGoods(String issueNumber, LocalDate issuedDate,
                                 Person receivedBy, List<IssueItem> items) {
        return null;
    }

    public InventoryReport viewInventoryReport(LocalDate startDate,
                                               LocalDate endDate,
                                               List<Product> selectedProducts) {
        return null;
    }

    public StockCount performStockCount(Product product, LocalDate countDate, int actualQuantity) {
        return null;
    }
}