package Chapter7.payroll;

import java.util.Scanner;

/**
 * Chapter7.payroll created by Remi on 2016-11-23.
 */
public class Payroll {
    public static void main(String[] args){
        Pay work = new Pay();
        Scanner input = new Scanner(System.in);
        int[] hours = new hours[work.getLength()];

        for (int i=0; i<work.getLength(); ++i) {
            System.out.println("How many hours has Employee #"+work.getEmployeeId(i)+" worked?");
            input.nextInt() = hours[i];
            while (hours[i]<6){
                System.out.println("Error, inadequit value!");
                System.out.println("How many hours has Employee #"+work.getEmployeeId(i)+" worked?");
                input.nextInt() = hours[i];
            }

        }

    }
}
