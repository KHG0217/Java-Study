package Chepter4.Polymorphism;

public class Cat extends Pet{
    String color;
    public Cat(String name, int age, String gender, String color){
        super(name, age, gender);
        this.color = color;
    }

    @Override
    public String getPet() {
        return super.getPet() + "\t" + color;
    }
}
