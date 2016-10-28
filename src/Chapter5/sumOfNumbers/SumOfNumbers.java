package sumOfNumbers;
import java.util.Scanner;

/**
 * Chapter5.sumOfNumbers created by Remi on 2016-10-28.
 */
public class SumOfNumbers {
    public static void main(String[] args){
        int amount;
        int total = 0;

        Scanner input=new Scanner(System.in);

        System.out.println("Up to what do you want us to count babe?");
        amount=input.nextInt();

        for(int i=0; i<=amount; i++){
            total+=i;
        }

        System.out.println("Hey babe, that's equal to "+total);
    }
}
