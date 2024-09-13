package DealingCar;

public class Part {
    private String partId;      // Unique ID for the part
    private String partName;
    private String manufacturer;       // DealingCar.Car manufacturer
    private int partNumber;
    private char condition;
    private int warranty;
    private double cost;
    private String note;

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }
    
    public String getPartName() { return partName; }
    
    public void setPartName(String partName) { this.partName = partName; }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPartnumber() {
        return partNumber;
    }

    public void setPartnumber(int partnumber) {
        this.partNumber = partnumber;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public void showpartDetails() {
        System.out.println("part Id: " + partId);
        System.out.println("part name: " + partName);
        System.out.println("manufacturer: " + manufacturer);  // Updated display for brand
        System.out.println("part number: " + partNumber);
        System.out.println("condition: " + condition);
        System.out.println("warranty: " + warranty);
        System.out.println("cost: " + cost);

        System.out.println("note: " + note);
    }
    @Override
    public String toString() {
        return "part{" +
                "partId='" + partId + '\'' +
                "partName='" + partName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", part number=" + partNumber +
                ", condition=" + condition +
                ", warranty=" + warranty +
                ", cost=" + cost +
                ", note='" + note + '\'' +
                '}';
    }
}