package bank;
import java.util.Scanner;

/**
 * bank created by Remi on 2016-10-05.
 */
public class Bank {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        BankCharges account=new BankCharges(0, 0, 0, 0);
        System.out.println("What is your total account balance?");
        account.setBalance(input.nextInt());
        System.out.println("How many cheques have you written?");
        account.setChecks(input.nextInt());
        System.out.println("It will cost you $" + account.calcCost());

    }
}
