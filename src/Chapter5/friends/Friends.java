package friends;

import java.io.*;
import java.util.Scanner;
/**
 * Chapter5.friends created by Remi on 2016-10-26.
 */
public class Friends {
    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\Remi\\Documents\\GitHub\\Java-Apps\\src\\Chapter5\\friends\\friends.txt");
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
}
