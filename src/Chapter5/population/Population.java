package Chapter5.population;
import java.util.Scanner;
/**
 * Chapter5.population created by Remi on 2016-11-03.
 */
public class Population {
    public static void main(String[] args){
        double population;
        double growthRate;
        int days;

        Scanner input=new Scanner(System.in);

        System.out.println("What is the starting size of your population?");
        population = input.nextInt();
        while(population<2){
            System.out.println("That is a an invalid size.");
            System.out.println("What is the starting size of your population?");
            population = input.nextInt();
        }

        System.out.println("What is the growth rate of your population?(%)");
        growthRate = (input.nextDouble()/100)+1;
        while(growthRate<1){
            System.out.println("That is a an invalid growth rate.");
            System.out.println("What is the growth rate of your population?(%)");
            growthRate = (input.nextDouble()/100)+1;
        }

        System.out.println("How many days will go by?");
        days = input.nextInt();
        while (days<1){
            System.out.println("Invalid number of days!");
            System.out.println("How many days will go by?");
            days = input.nextInt();
        }

        for(int i=0; i<=days; ++i){
            population *= growthRate;
            System.out.println("After day "+ i + " at a growth rate of "+ (growthRate-1)*100+"%, on day "+i+" your population will reach "+ (population-(population%1))+" organisms.");
        }
    }
}
