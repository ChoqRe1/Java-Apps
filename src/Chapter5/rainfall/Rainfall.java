package Chapter5.rainfall;
import java.util.Scanner;
/**
 * Chapter5.rainfall created by Remi on 2016-11-04.
 */
public class Rainfall {
    public static void main(String[] args){
        int years;
        int months = 0;
        int rainfall;
        int totalRainfall = 0;
        int monthsInAYear = 12;

        Scanner input=new Scanner(System.in);

        System.out.println("How many years has rain fallen for?");
        years = input.nextInt();
        while(years<1){
            System.out.println("This is an invalid number of years!");
            System.out.println("How many years has rain fallen for?");
            years = input.nextInt();
        }

        for(int i=1; i <= years; ++i){
            for(int j=1; j <= monthsInAYear; ++j){
                System.out.println("How inches of rain fell month "+j+" of year "+i+"?");
                rainfall = input.nextInt();
                while(rainfall<0){
                    System.out.println("This is an invalid amount of rain!");
                    System.out.println("How inches of rain fell month "+j+" of year "+i+"?");
                    rainfall = input.nextInt();
                }
                totalRainfall += rainfall;
                ++ months;
            }
        }
        System.out.println(months+" months went by with " +totalRainfall+" inches of rain falling. That is an average of " +(totalRainfall/months)+" inches of rain per month.");
    }
}
