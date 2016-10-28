/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;
import java.util.Scanner;
/**
 *
 * @author Remi
 */
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner goldfish = new Scanner(System.in);

        System.out.println("How many copies would you like to buy?");
        int units = goldfish.nextInt();
        double discount = 0;

        if(units >= 100) {
            discount = 50;
        } else if(units >= 50) {
            discount = 40;
        } else if(units >= 20) {
            discount = 30;
        } else if(units >= 10) {
            discount = 20;
        }

        double total = units * 99.00;
        double discounted = (total / 100) * discount;
        double finalPrice = total - discounted;

        System.out.println("Total price: " + total);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted: " + discounted);
        System.out.println("Price: " + finalPrice);
    }
    
}
