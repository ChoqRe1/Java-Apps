package date;
import java.util.Scanner;
/**
 * date created by Remi on 2016-10-12.
 */
public class Date {
    public static void main(String[] args){
        MagicDate magic=new MagicDate(25, 6, 16);
        Scanner input=new Scanner(System.in);
        System.out.println("What is your Day?");
        magic.setDay(input.nextInt());
        System.out.println("What is your Month?");
        magic.setMounth(input.nextInt());
        System.out.println("What is your Year?");
        magic.setYear(input.nextInt());
        System.out.println("Is this date magic?");
        System.out.println(magic.isMagic());
    }
}
