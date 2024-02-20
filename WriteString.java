
/****************************
 Mallory Pulliam
 Lab #6
*****************************/

import java.io.*;

public class WriteString {
    // Constructor to write a string to a file
    public WriteString(String fileName, String content) {
        File file = new File(fileName);
        try {
            // Check if the file is empty
            long size = file.length();
            if (size == 0) {
                // Create FileOutputStream and PrintStream
                FileOutputStream fout = new FileOutputStream(file);
                PrintStream ps = new PrintStream(fout);
                // Write the string to the file
                ps.println(content);
                // Close the streams
                ps.close();
                fout.close();
                System.out.println("String has been written to the file: " + fileName);
            }

            else {
                System.out.println("File is not empty. Please provide an empty file.");
            }
        }

        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        WriteString ws = new WriteString("f1.txt", "Hello world");
    }
}
