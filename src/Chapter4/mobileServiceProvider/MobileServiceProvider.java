/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileServiceProvider.mobileserviceprovider;

/**
 *
 * @author 1531537
 */
import java.util.Scanner;

public class MobileServiceProvider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MobilePlan p1 = new MobilePlan();
        System.out.println("Which plan do you choose? [a, b or c]");
        p1.setPlan(input.next());
        System.out.println("How many minutes did you use?");
        p1.setMinutes(input.nextDouble());
        System.out.println("Monthly fee: " +p1.getMonthlyFee());
    }
    
}
