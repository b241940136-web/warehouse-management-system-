package warehouse;

import java.time.LocalDate;
import java.util.List;

public class GoodsIssue {
    private String id;
    private String issueNumber;
    private LocalDate issuedDate;
    private Person receivedBy;
    private Storekeeper issuedBy;
    private Warehouse warehouse;
    private List<IssueItem> items;

    public GoodsIssue() {
    }

    public GoodsIssue(String id, String issueNumber, LocalDate issuedDate,
                      Person receivedBy, Storekeeper issuedBy,
                      Warehouse warehouse, List<IssueItem> items) {
        this.id = id;
        this.issueNumber = issueNumber;
        this.issuedDate = issuedDate;
        this.receivedBy = receivedBy;
        this.issuedBy = issuedBy;
        this.warehouse = warehouse;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public Person getReceivedBy() {
        return receivedBy;
    }

    public Storekeeper getIssuedBy() {
        return issuedBy;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public List<IssueItem> getItems() {
        return items;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setReceivedBy(Person receivedBy) {
        this.receivedBy = receivedBy;
    }

    public void setIssuedBy(Storekeeper issuedBy) {
        this.issuedBy = issuedBy;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setItems(List<IssueItem> items) {
        this.items = items;
    }

    public void printIssueSlip() {
    }
}
