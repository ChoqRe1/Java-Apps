/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;
import java.util.Scanner;
/**
 *
 * @author Remi
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("What was your result for your first test?");
    int test1=input.nextInt();
    System.out.println("What was your result for your second test?");
    int test2=input.nextInt();
    System.out.println("What was your result for your last test?");
    int test3=input.nextInt();
    TestScore t1=new TestScore(test1, test2, test3);
    if(t1.getAvg()>=90)
            {
                System.out.println("Your average grade is "+t1.getAvg()+" that's an A, awesome!");
            }
    else if(t1.getAvg()>=80)
            {
                System.out.println("Your average grade is "+t1.getAvg()+" that's a B, good job!");
            }
    else if(t1.getAvg()>=70)
            {
                System.out.println("Your average grade is "+t1.getAvg()+" that's a C, try harder next time!");
            }
    else if(t1.getAvg()>=60)
            {
                System.out.println("Your average grade is "+t1.getAvg()+" that's a D, you can do better!");
            }
    else if(t1.getAvg()<60)
            {
                System.out.println("Your average grade is "+t1.getAvg()+" that's an F, you failed!");
            }
    }
    
}
