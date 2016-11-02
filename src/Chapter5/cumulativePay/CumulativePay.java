package Chapter5.cumulativePay;
import java.util.Scanner;

/**
 * Chapter5.cumulativePay created by Remi on 2016-11-02.
 */
public class CumulativePay {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double money = 0.5;
        System.out.println("How many days have you worked fam?");
        int days=input.nextInt();
        for(int i=1; days>=i; i++){
            money*=2;
        }
        System.out.println("You are making $"+(money/100));
    }
}
