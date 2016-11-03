package Chapter5.hotelOccupancy;
import java.util.Scanner;

/**
 * Chapter5.hotelOccupancy created by Remi on 2016-11-02.
 */
public class HotelOccupancy {
    public static void main(String[] args){
        int floors;
        int rooms;
        int occupiedRooms;
        double totalRooms = 0.0;
        double totalOccupiedRooms = 0.0;

        Scanner input=new Scanner(System.in);

        System.out.println("How many floors are there in your hotel?");
        floors = input.nextInt();
        while(floors < 1){
            System.out.println("That is an invalid number of floors!");
            System.out.println("How many floors are there in your hotel?");
            floors = input.nextInt();
        }

        for(int i=1; i<=floors; ++i){

            System.out.println("How many rooms are on floor "+ i +"?");
            rooms = input.nextInt();

            while(rooms < 10){
                System.out.println("That is an invalid number of rooms!");
                System.out.println("How many rooms are on floor "+ i +"?");
                rooms = input.nextInt();
            }
            totalRooms += rooms;

            System.out.println("How many rooms are occupied on floor "+ i +"?");
            occupiedRooms = input.nextInt();

            while(0 > occupiedRooms || occupiedRooms>rooms){
                System.out.println("That is an invalid number of occupied rooms!");
                System.out.println("How many rooms are on floor "+ i +"?");
                occupiedRooms = input.nextInt();
            }
            totalOccupiedRooms += occupiedRooms;
        }
        double occupancyRate = 100*(totalOccupiedRooms/totalRooms);
        System.out.println("Your hotel's occupancy rate is of "+ occupancyRate + "%.");
    }
}
