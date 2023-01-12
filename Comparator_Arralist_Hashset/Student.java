package Comparator_Arralist_Hashset;

public class Student implements Comparable<Student> {

    String name;
    int id;
    double cgpa;

    public Student(String name,int id, double cgpa){
        this.name =name;
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}