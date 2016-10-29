package distanceTraveled;
import java.util.Scanner;
import java.io.*;

/**
 * Chapter5.distanceTraveled created by Remi on 2016-10-28.
 */
public class DistanceTraveled {
    public static void main(String[] args) throws IOException{
        //Calling Variables
        int hours;
        int speed;
        //Creating Scanner & File
        Scanner input=new Scanner(System.in);
        File file=new File("itinirary.txt");
        PrintWriter pw=new PrintWriter(file);
        //User Interaction
        System.out.println("How many hours will you travel for?");
        hours=input.nextInt();
        System.out.println("What is the speed you will be travelling at?");
        speed=input.nextInt();
        //Creating Chart
        pw.println("HOURS       DISTANCE");
        //for Loop
        for(int i=1; i<=hours; i++){
            pw.println("   "+(i)+"        "+(speed*i));
        }
        pw.close();
    }
}
