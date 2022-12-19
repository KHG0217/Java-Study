package Chepter8.Generic;

class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

public class Box2<T extends Pet> {
    T obj;
    public void setValue(T obj){
        this.obj = obj;
    }
    public T getValue(){
        return obj;
    }
}
