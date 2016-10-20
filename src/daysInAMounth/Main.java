package daysInAMounth;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Which month is it? (January=1,December=12):");
    int month=input.nextInt();
    System.out.println("Which year is it:");
    int year=input.nextInt();
    Month m1=new Month(year,month);
    System.out.println("This month has "+m1.getDays()+" days");
    }
    
}
