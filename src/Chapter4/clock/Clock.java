/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import java.util.Scanner;
/**
 *
 * @author Remi
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
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
