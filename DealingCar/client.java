package DealingCar;

public class client {
    public int spending;
    public String membership;
    public int discountrate;

    public int getSpending() {
        return spending;
    }

    public void setSpending(int spending) {
        this.spending = spending;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public int getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(int discountrate) {
        this.discountrate = discountrate;
    }

    @Override
    public String toString() {
        return "client{" +
                "spending=" + spending +
                ", membership='" + membership + '\'' +
                ", discountrate=" + discountrate +
                '}';
    }
}
