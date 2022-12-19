package Chepter8.Generic;

public class Group<T>{
    T obj;
    public void setValue(T obj){
        this.obj = obj;
    }
    public T getValue(){
        return obj;
    }
}
class Person{}
class Man extends Person{}
class Woman extends Person{}
