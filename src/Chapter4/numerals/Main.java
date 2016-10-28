package numerals;
import java.util.Scanner;
/**
 * numerals created by Remi on 2016-10-19.
 */
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("What is your number?");
        int number = input.nextInt();
        String numeral = "";

        if(number == 1){
            numeral = "I";
        }else if(number == 2){
            numeral = "II";
        }else if(number == 3){
            numeral = "III";
        }else if(number == 4){
            numeral = "IV";
        }else if(number == 5){
            numeral = "V";
        }else if(number == 6){
            numeral = "VI";
        }else if(number == 7){
            numeral = "VII";
        }else if(number == 8){
            numeral = "VIII";
        }else if(number == 9){
            numeral = "IX";
        }else if(number == 10){
            numeral = "X";
        }else {numeral="ERROR";}
            System.out.println(numeral);
    }
}
