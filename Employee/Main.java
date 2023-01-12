package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Employee>empList=new ArrayList<Employee>();
    public void addEmployee(Employee employee){
        empList.add(employee);
    }
    public void removeEmployee(int id){
        for (Employee emp:empList){
            if(emp.getId()==id){
                empList.remove(emp);
            }
        }
        showEmployeeLIst();
    }
    public void showEmployeeLIst(){
            for (Employee emp:empList){
                System.out.println(emp.getName()+" "+emp.getId()+" "+emp.getSalary());
            }
    }
    public static void main(String[] args) {

    }
}
