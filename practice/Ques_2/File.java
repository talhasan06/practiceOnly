package practice.Ques_2;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));

            String text;

            while ((text = reader.readLine()) != null) {

                String[] lines = text.split("\n");

                for (int i = 0; i < lines.length; i++) {

//                    String[] tokens = lines[i].split("/");

//                    System.out.println("Name: " + tokens[0]);
//                    System.out.println("Batch: " + tokens[1]);
//                    System.out.println("Roll No: " + tokens[2]);

                    System.out.println();
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
