package ArrayListWithClassObject;

public class Employee {
    String name;
    int age;
    double salary;
    Employee(){

    }
    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+" "+"Age: "+age+" "+"Salary: "+salary+"\n";
    }

}
