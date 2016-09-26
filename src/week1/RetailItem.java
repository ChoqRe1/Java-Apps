package week1;

/**
 * Created by Remi on 2016-09-23.
 */
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }
}
