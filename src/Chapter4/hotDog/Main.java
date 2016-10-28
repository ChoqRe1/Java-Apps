package pkg278.pkg17;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("How many people are attending your feast?:");
    int hoomans=input.nextInt();
    System.out.println("How many hot dogs will each person consume?:");
    int eat=input.nextInt();
    hotdawg f1=new hotdawg(hoomans,eat);
    System.out.println("You will require "+f1.getDawgs()+" packages of hot dogs");
    System.out.println("You will require "+f1.getBreads()+" packages of breads");
    System.out.println("There will be "+f1.getDawgleftovers()+" hot dogs leftover");
    System.out.println("There will be "+f1.getBreadsleftovers()+" breads leftover");
    }    
}
