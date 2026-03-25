package warehouse;

import java.time.LocalDate;
import java.util.List;

public class GoodsReceipt {
    private String id;
    private String receiptNumber;
    private LocalDate receivedDate;
    private Person deliveredBy;
    private Storekeeper receivedBy;
    private Warehouse warehouse;
    private List<ReceiptItem> items;

    public GoodsReceipt() {
    }

    public GoodsReceipt(String id, String receiptNumber, LocalDate receivedDate,
                        Person deliveredBy, Storekeeper receivedBy,
                        Warehouse warehouse, List<ReceiptItem> items) {
        this.id = id;
        this.receiptNumber = receiptNumber;
        this.receivedDate = receivedDate;
        this.deliveredBy = deliveredBy;
        this.receivedBy = receivedBy;
        this.warehouse = warehouse;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public Person getDeliveredBy() {
        return deliveredBy;
    }

    public Storekeeper getReceivedBy() {
        return receivedBy;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public List<ReceiptItem> getItems() {
        return items;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public void setDeliveredBy(Person deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public void setReceivedBy(Storekeeper receivedBy) {
        this.receivedBy = receivedBy;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setItems(List<ReceiptItem> items) {
        this.items = items;
    }

    public void printReceipt() {
    }
}
