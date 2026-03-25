package warehouse;

import java.time.LocalDate;
import java.util.List;

public class InventoryReport {
    private Warehouse warehouse;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Product> selectedProducts;

    public InventoryReport() {
    }

    public InventoryReport(Warehouse warehouse, LocalDate startDate,
                           LocalDate endDate, List<Product> selectedProducts) {
        this.warehouse = warehouse;
        this.startDate = startDate;
        this.endDate = endDate;
        this.selectedProducts = selectedProducts;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public List<Product> getSelectedProducts() {
        return selectedProducts;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setSelectedProducts(List<Product> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public void generateReport() {
    }

    public void filterByProducts(List<Product> products) {
    }

    public int calculateBeginningBalance(Product product) {
        return 0;
    }

    public int calculateTotalReceipt(Product product) {
        return 0;
    }

    public int calculateTotalIssue(Product product) {
        return 0;
    }

    public int calculateEndingBalance(Product product) {
        return 0;
    }
}