package shipping;
import java.util.Scanner;
/**
 * Created by Remi on 2016-09-30 ${VERSION}.
 */
public class Shipping {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);

        int miles;
        double rate = 0;
        double weight;

        System.out.println("How far away would you like to send your package?");
        miles = input.nextInt();

        int charges = miles / 500;

        System.out.println("What is the weight of your package?");
        weight = input.nextDouble();

        if (weight <= 2)
            rate = 1.10;
        else if(weight <= 6)
            rate = 2.20;
        else if(weight <= 10)
            rate = 3.70;
        else
            rate = 4.80;

        double finalPrice = rate * charges;
        System.out.println("\n\n\n\n\n\n\n\nPackage weight: " + weight + "kg\nDistance to travel: " + miles + " miles\n\nThis will cost you $" + finalPrice);
    }



}
