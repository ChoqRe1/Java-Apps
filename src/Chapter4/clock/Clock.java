package Chapter4.clock;
import java.util.Scanner;
public class Clock {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many seconds have gone by?");
        double sec=input.nextInt();
        if(sec>=86400){
            sec = sec/86400;
            System.out.println(sec + " days");
        }else if(sec>=3600){
            sec = sec/3600;
            System.out.println(sec + " hours");
        }else if(sec>=60){
            sec = sec/60;
            System.out.println(sec + " minutes");
        }else{
            System.out.println(sec+ " seconds");
        }
    } 
    
}
