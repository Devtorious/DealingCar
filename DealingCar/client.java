package DealingCar;

import static DealingCar.SaleTransaction.*;

public class client {
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
private int caldiscountRate(String id){
        if (id == clientId){
            spending+=SaleTransaction.totalAmount;
        }
        return spending;
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
