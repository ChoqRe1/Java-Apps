package pkg274.pkg7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number of calories:");
    double calories=input.nextDouble();
    System.out.println("Enter a number of fat grams:");
    double fat=input.nextDouble();
    energy u1=new energy(calories,fat);
    System.out.println("Your total fat is: "+u1.getPercentage());
    
    }
    
}
