package Chapter5.greatestAndLeastOfThese;


import java.util.Scanner;


public class GreatestAndLeastOfThese {
    public static void main (String[] args){
        int num;
        int greatest;
        int least;
        Scanner input1 = new Scanner (System.in);
        System.out.println("Enter any integers you want to compare. When you are " +
                "done write in '-99'.");
        num = input1.nextInt();
        greatest = num;
        least = num;
        while (num != -99)
        {
            num = input1.nextInt();
            if ((num < least) && (num != -99))
            {
                least = num;
            }
            if ((num > greatest) && (num != -99))
            {
                greatest = num;
            }
        }
        if (num == -99)
        {
            System.out.println("The greatest number entered is " + greatest + ".");
            System.out.println("The least number entered is " + least + ".");
        }
    }
}