package Comparator_Arralist_Hashset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListComparatorExample {
    public static void main(String[] args) {
//        ArrayList<Integer> integerArrayList =new ArrayList<Integer>();
//
//        integerArrayList.add(1);
//        integerArrayList.add(1,2);
//        for(int a: integerArrayList){
//            System.out.println(a);
//        }

        try
        {
            ArrayList<Student>students =new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("Student-List.txt"));

            String text;
            while((text=reader.readLine())!=null)
            {
                String [] lines = text.split("\n");
                for(String line: lines)
                {
                    String[] tokens = line.split(" ");
                    String name = tokens[0];

                    int id = Integer.parseInt(tokens[1]);

                    double cgpa = Double.parseDouble(tokens[2]);

                    Student temp = new Student(name,id,cgpa);
                    students.add(temp);
                }
            }
//            Collections.sort(students);
            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.cgpa> o2.cgpa)
                        if(o1.id>o2.id)
                            return -1;
                        else
                            return 1;
                    else return 1;
                }
            });
            printStudentData(students);
            reader.close();

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
    public static void printStudentData(ArrayList<Student> mStudents){
        for(Student s: mStudents)
            System.out.println(s.name + " " + s.id + " " + s.cgpa);
    }
}