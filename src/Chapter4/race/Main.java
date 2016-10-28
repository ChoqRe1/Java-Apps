package race;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("What is the name of the first racer?:");
    String r1=input.nextLine();
    System.out.println("In how much time did he complete the race?:");
    double t1=input.nextDouble();
    input.nextLine();
    System.out.println("What is the name of the second racer?:");
    String r2=input.nextLine();
    System.out.println("In how much time did he complete the race?:");
    double t2=input.nextDouble();
    input.nextLine();
    System.out.println("What is the name of the thrid racer?:");
    String r3=input.nextLine();
    System.out.println("In how much time did he complete the race?:");
    double t3=input.nextDouble();
    Racers race=new Racers(r1,r2,r3,t1,t2,t3);
    System.out.println("In first place arrived: "+race.getFirst());
    System.out.println("In second place arrived: "+race.getSecond());
    System.out.println("In thrid place arrived: "+race.getThird());
    
    }
    
}
