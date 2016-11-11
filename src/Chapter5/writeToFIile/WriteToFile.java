package Chapter5.writeToFIile;


import java.io.IOException;

/**
 * Chapter5.writeToFIile created by Remi on 2016-11-11.
 */
public class WriteToFile {
    public static void main(String[] args) throws IOException{
        ReadWrite rw= new ReadWrite("input.txt", "output.txt");
    }
}
