package Chapter5.barChart;
import java.util.Scanner;

/**
 * Chapter5.barChart created by Remi on 2016-11-09.
 */
public class BarChart {
    public static void main(String[] args){
        int store1;
        int store2;
        int store3;
        int store4;
        int store5;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter today's sales for store 1:");
        store1 = (input.nextInt())/100;
        System.out.println("Enter today's sales for store 2:");
        store2 = (input.nextInt())/100;
        System.out.println("Enter today's sales for store 3:");
        store3 = (input.nextInt())/100;
        System.out.println("Enter today's sales for store 4:");
        store4 = (input.nextInt())/100;
        System.out.println("Enter today's sales for store 5:");
        store5 = (input.nextInt())/100;

        System.out.println("SALES BAR CHART");
//        Creating for loops to create the bars
        System.out.print("Store 1: ");
        for(int i = 1; store1>=i; ++i){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 2: ");
        for(int i = 1; store2>=i; ++i){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 3: ");
        for(int i = 1; store3>=i; ++i){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 4: ");
        for(int i = 1; store4>=i; ++i){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Store 5: ");
        for(int i = 1; store5>=i; ++i){
            System.out.print("*");
        }
        System.out.println();
    }
}
