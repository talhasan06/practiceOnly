package File;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
//        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
////            writer.write("This is a Test File");
//            for(String Name: names){
//                writer.write(Name+"\n");
//            }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));

            String text;

            while ((text = reader.readLine()) != null) {

                String[] lines = text.split("\n");

                for (int i = 0; i < lines.length; i++) {

                    String[] tokens = lines[i].split("/");

//                    int batch=Integer.parseInt(tokens[1]);

                    System.out.println("Name: " + tokens[0]);
                    System.out.println("Batch: " + tokens[1]);
                    System.out.println("Roll No: " + tokens[2]);

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
