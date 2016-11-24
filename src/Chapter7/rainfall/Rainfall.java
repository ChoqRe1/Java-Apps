package rainfall;
import Chapter7.rainfall.rain;

import java.util.Scanner;
/**
 *
 * @author Remi
 */
public class Rainfall {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double[] ro = new double[12];

        for(int f = 0; f<12; f++){
            System.out.println("RAINFALL");
            double k = x.nextDouble();
            while(k<0){
                System.out.println("RAINFALL AGAIN NOT GOOD");
                k = x.nextDouble();
            }
            ro[f] = k;
        }
        rain goog = new rain(ro);
        goog.total();
        goog.avg();
        goog.high();
        goog.low();
    }
}