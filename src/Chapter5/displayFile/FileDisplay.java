package Chapter5.displayFile;
import java.io.*;
import java.util.Scanner;

/**
 * Chapter5.displayFile created by Remi on 2016-11-09.
 */
public class FileDisplay {
    private File file;
    private String f;
    private Scanner input;

    public FileDisplay(String f) throws IOException{
        file = new File(f);
        this.f = f;
        input=new Scanner(file);
    }

    public void displayHead()throws IOException{
        int count=0;
        input=new Scanner(file);
        while(input.hasNext()&&count<=5){
            String line = input.nextLine();
            System.out.println(line);
            count++;
        }
        input.close();
    }

    public void displayContents()throws IOException{
        input=new Scanner(file);
        while(input.hasNext()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

    public void displayWithLineNumbers()throws IOException{
        input=new Scanner(file);
        int count=1;
        while(input.hasNext()){
            String line = input.nextLine();
            System.out.println(count+": "+line);
            count++;
        }
        input.close();
    }

}
