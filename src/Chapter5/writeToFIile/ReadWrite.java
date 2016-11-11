package Chapter5.writeToFIile;
import java.io.*;
import java.util.Scanner;

/**
 * Chapter5.writeToFIile created by Remi on 2016-11-11.
 */
public class ReadWrite {
    File fr;
    File fw;
    Scanner input;

    public ReadWrite(String r, String w) throws IOException{
        fr = new File(r);
        fw = new File(w);
        PrintWriter pw = new PrintWriter(w);
        input=new Scanner(fr);
        while (input.hasNext()){
            String l = input.nextLine();
            l=l.toUpperCase();
            pw.println(l);
        }
        pw.close();
    }
}
