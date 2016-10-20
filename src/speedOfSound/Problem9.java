package speedOfSound;
import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Where is your soundwave travelling ? (Air, Water, Steel)");
    String type=input.nextLine();
    System.out.println("How many feet did the soundwave travel?");
    double feet=input.nextDouble();
    Speed s1=new Speed(feet);
    if(type.equals("Air"))
    {
        System.out.println("It will take: "+s1.getSpeedinAir()+" seconds to travel that distance ");
    }
    else if(type.equals("Water"))
    {
        System.out.println("It will take: "+s1.getSpeedinWater()+" seconds to travel that distance ");
    }
    else if(type.equals("Steel"))
    {
        System.out.println("It will take: "+s1.getSpeedinSteel()+" seconds to travel that distance ");
    }
    else
    {
        System.out.println("That medium is not supported");
    }
    
    
    
    
    }
    
}
