package DealingCar;

import java.util.ArrayList;
import java.util.Date;

public class SaleTransaction {
    private String id;
    private Date transactionDate;
    private String clientId;
    private String salespersonId;
    private String serviceType;
    private ArrayList<String> purchasedItems;
    private int discount;
    private int totalAmount;
    private String additionalNote;


    public SaleTransaction(String id, Date transactionDate, String clientId, String salespersonId,
                           String serviceType, ArrayList<String> purchasedItems, int discount,
                           int totalAmount, String additionalNote) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.clientId = clientId;
        this.salespersonId = salespersonId;
        this.serviceType = serviceType;
        this.purchasedItems = purchasedItems;
        this.discount = discount;
        this.totalAmount = totalAmount;
        this.additionalNote = additionalNote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSalespersonId() {
        return salespersonId;
    }

    public void setSalespersonId(String salespersonId) {
        this.salespersonId = salespersonId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ArrayList<String> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(ArrayList<String> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getAdditionalNote() {
        return additionalNote;
    }

    public void setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote;
    }

    @Override
    public String toString() {
        return "SaleTransaction{" +
                "id='" + id + '\'' +
                ", transactionDate=" + transactionDate +
                ", clientId='" + clientId + '\'' +
                ", salespersonId='" + salespersonId + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", purchasedItems=" + purchasedItems +
                ", discount=" + discount +
                ", totalAmount=" + totalAmount +
                ", additionalNote='" + additionalNote + '\'' +
                '}';
    }
}


