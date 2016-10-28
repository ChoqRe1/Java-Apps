package distanceTraveled;
import java.util.Scanner;

/**
 * Chapter5.distanceTraveled created by Remi on 2016-10-28.
 */
public class DistanceTraveled {
    public static void main(String[] args){
        //Calling Variables
        int hours;
        int speed;
        //Creating Scanner
        Scanner input=new Scanner(System.in);
        //User Interaction
        System.out.println("How many hours will you travel for?");
        hours=input.nextInt();
        System.out.println("What is the speed you will be travelling at?");
        speed=input.nextInt();
        //Creating Chart
        System.out.println("HOURS       DISTANCE");
        //for Loop
        for(int i=1; i<=hours; i++){
            System.out.println("   "+(i)+"        "+(speed*i));
        }
    }
}
