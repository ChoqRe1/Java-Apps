package Chapter5.additionMachine;

import java.util.Scanner;

/**
 * Chapter5.additionMachine created by Remi on 2016-10-26.
 */
public class AdditionMachine {
    public static void main(String[] args){
        int sum=0;

        Scanner input= new Scanner (System.in);
        System.out.println (" Enter a number y/n ");

        String line = input.nextLine();
        char ans = line.charAt(0);
        while( ans == 'y' || ans == 'Y') {
            System.out.println("Enter a value");
            int val = input.nextInt();
            input.nextLine();
            sum += val;
            System.out.println(" Enter a number y/n ");

            line = input.nextLine();
            ans = line.charAt(0);
        }
            System.out.println("Your total sum is " + sum);

    }
}
