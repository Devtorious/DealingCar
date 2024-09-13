package DealingCar;

public class Client {
    public int spending;
    public String membership;
    public int discountRate;

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

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
private class caldiscountRate{
        
}
    @Override
    public String toString() {
        return "client{" +
                "spending=" + spending +
                ", membership='" + membership + '\'' +
                ", discount rate=" + discountRate +
                '}';
    }
}
