package ArrayListWithClassObject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        ArrayList<Employee> emp=new ArrayList<>();

        Employee e1=new Employee("Tamim",22,5000);

        Employee e2=new Employee("John",26,12000);

        emp.add(e1);

        emp.add(e2);

//        emp.remove(e1);

        Scanner input=new Scanner(System.in);
        String s=input.nextLine();

        for (int i=0;i<emp.size();i++){
            if(s.equals(emp.get(i).name)){
//                emp.remove(i);
//                System.out.println(emp.get(i).toString());
            }
        }

//        remove same like search


//        for (int i=0;i<emp.size();i++){
//            System.out.println(emp.get(i).toString());
//        }
    }
}
