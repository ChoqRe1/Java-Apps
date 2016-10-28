/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileServiceProvider.mobileserviceprovider;

/**
 *
 * @author 1531537
 */
public class MobilePlan {
    private double monthlyFee;
    private String planLetter;
    private double baseFee;
    private double minutes;
    private double overPrice;
    
    public void setPlan(String p){
        planLetter = p;
    }
    public void setMinutes(double m){
        minutes = m;
    }
    public double getMonthlyFee(){
        switch(planLetter.toLowerCase()){
            case "a":
                baseFee = 39.99;
                if(minutes > 450){
                    overPrice = (minutes - 450)*0.45;
                    monthlyFee = overPrice;
                } else {
                    monthlyFee = baseFee;
                }
            break;
            case "b": 
                baseFee = 59.99;
                if(minutes > 900){
                    overPrice = (minutes - 900)*0.40;
                    monthlyFee = overPrice;
                } else {
                    monthlyFee = baseFee;
                }
            break;
            case "c": 
                monthlyFee = 69.99;
            break;
            default: System.out.println("Invalid Plan!");
            break;
        }
        return monthlyFee;
    }
}
