package week1;
import java.util.Scanner;
/**
 * Created by Remi on 2016-09-23.
 */
public class Test {

    public static void main(String[] args) {
        RetailItem i1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem i2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem i3 = new RetailItem("Shirt", 20, 24.95);
        System.out.println("Item 1: "+i1.getDescription()+", Inventory: "+i1.getUnitsOnHand()+" units available, and each one sells for: "+i1.getPrice()+"$");
        System.out.println("Item 2: "+i2.getDescription()+", Inventory: "+i2.getUnitsOnHand()+" units available, and each one sells for: "+i2.getPrice()+"$");
        System.out.println("Item 3: "+i3.getDescription()+", Inventory: "+i3.getUnitsOnHand()+" units available, and each one sells for: "+i3.getPrice()+"$");

    }
}
