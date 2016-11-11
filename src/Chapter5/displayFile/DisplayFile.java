package Chapter5.displayFile;
import java.io.*;
import java.util.Scanner;

/**
 * Chapter5.displayFile created by Remi on 2016-11-09.
 */
public class DisplayFile {
    public static void main(String[] args) throws IOException{

        FileDisplay df=new FileDisplay("data.txt");

        df.displayHead();
        System.out.println("^^ HEADER ^^");
        df.displayContents();
        df.displayWithLineNumbers();
    }
}
