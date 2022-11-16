package Chepter4.Polymorphism;

public class Employee {
    String name;
    int salary;
    public String getEmployee(){
        return name + " " + salary;
    }

    public Employee(){};
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}
