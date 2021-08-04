import java.util.Scanner;

import java.io.*;

public final class fileIn {
    String fname;

    public fileIn() {
        getFileName();
        readFileContents();
    }

    public void readFileContents()
    {
        boolean looping;
        DataInputStream in;
        String line;
        int j, len;
        char ch;

    }

    public void getFileName()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter file name please.");
        fname = in.nextLine();
        System.out.println("You entered "+fname);
    }

}