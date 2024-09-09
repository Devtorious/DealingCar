package DealingCar;

public class part {
    private String partId;      // Unique ID for the part
    private String manufacturer;       // DealingCar.Car manufacturer
    private int partnumber;
    private char condition;
    private int warrenty;
    private int cost;
    private String note;

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(int partnumber) {
        this.partnumber = partnumber;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }

    public int getCost() {
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
        System.out.println("manufacturer: " + manufacturer);  // Updated display for brand
        System.out.println("part number: " + partnumber);
        System.out.println("condition: " + condition);
        System.out.println("warrenty: " + warrenty);
        System.out.println("cost: " + cost);

        System.out.println("note: " + note);
    }
    @Override
    public String toString() {
        return "part{" +
                "partId='" + partId + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", partnumber=" + partnumber +
                ", condition=" + condition +
                ", warrenty=" + warrenty +
                ", cost=" + cost +
                ", note='" + note + '\'' +
                '}';
    }
}