package pizzaProblem;
import java.util.Scanner;
//Created by ChoqRe1

public class PizzaProblem {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Pizza order=new Pizza("", 0, 0, 0);
        System.out.println("What size pizza would you like? (Small, Medium or Large)");
        order.setSize(input.nextLine());
        System.out.print("How many cheese toppings would you like on your pizza? ");
        order.setCheese(input.nextInt());
        System.out.print("How many pepperoni toppings would you like on your pizza? ");
        order.setPepperoni(input.nextInt());
        System.out.print("How many ham toppings would you like on your pizza? ");
        order.setHam(input.nextInt());
        System.out.println(order.getDescription());
        System.out.println("The price will be $" + order.calcCost());
    }
    
}
