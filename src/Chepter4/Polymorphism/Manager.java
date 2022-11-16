package Chepter4.Polymorphism;

public class Manager extends Employee{
    String depart;

    @Override
    public String getEmployee() {
        return super.getEmployee() + " " + depart;
    }

    public Manager(String name, int salary, String depart){
        super(name, salary);
        this.depart=depart;

    }
}
