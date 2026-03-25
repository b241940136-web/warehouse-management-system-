package warehouse;

import java.util.List;

public class Warehouse {
    private String id;
    private String name;
    private String location;
    private Storekeeper storekeeper;
    private List<InventoryRecord> inventoryRecords;
    private List<GoodsReceipt> receipts;
    private List<GoodsIssue> issues;
    private List<StockCount> stockCounts;

    public Warehouse() {
    }

    public Warehouse(String id, String name, String location, Storekeeper storekeeper,
                     List<InventoryRecord> inventoryRecords,
                     List<GoodsReceipt> receipts,
                     List<GoodsIssue> issues,
                     List<StockCount> stockCounts) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.storekeeper = storekeeper;
        this.inventoryRecords = inventoryRecords;
        this.receipts = receipts;
        this.issues = issues;
        this.stockCounts = stockCounts;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Storekeeper getStorekeeper() {
        return storekeeper;
    }

    public List<InventoryRecord> getInventoryRecords() {
        return inventoryRecords;
    }

    public List<GoodsReceipt> getReceipts() {
        return receipts;
    }

    public List<GoodsIssue> getIssues() {
        return issues;
    }

    public List<StockCount> getStockCounts() {
        return stockCounts;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStorekeeper(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

    public void setInventoryRecords(List<InventoryRecord> inventoryRecords) {
        this.inventoryRecords = inventoryRecords;
    }

    public void setReceipts(List<GoodsReceipt> receipts) {
        this.receipts = receipts;
    }

    public void setIssues(List<GoodsIssue> issues) {
        this.issues = issues;
    }

    public void setStockCounts(List<StockCount> stockCounts) {
        this.stockCounts = stockCounts;
    }

    public void addReceipt(GoodsReceipt receipt) {
    }

    public void addIssue(GoodsIssue issue) {
    }

    public void addStockCount(StockCount stockCount) {
    }

    public InventoryRecord findInventoryRecord(Product product) {
        return null;
    }

    public void updateInventoryAfterReceipt(GoodsReceipt receipt) {
    }

    public void updateInventoryAfterIssue(GoodsIssue issue) {
    }

    public void updateInventoryAfterStockCount(StockCount stockCount) {
    }
}